package model;

import controller.Ressource;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Map {

    private java.util.Map<String, Map> nextRooms = new HashMap<String, Map>();
    private static final List<String> DIRECTIONS  = Arrays.asList("north", "south", "east", "west");
    private static final int PERCENT_CREATE_NEW_ROOM = 50;
    private static final int FINAL_LAYER = 6;
    private Boolean isAlreadyVisited = false;
    public static int nbMap = 0;
    public static int nbMapVisited = 0;
    public Fight fight;
    public Chest chest;
    public Item item;
    public Trap trap;

    private Integer posX;
    private Integer posY;
    private String previousMapDirection;


    public Map(Player player) {
        this.posX = 0;
        this.posY = 0;

        for (String direction : DIRECTIONS) {
            if (this.nextRooms.containsKey(direction)) continue;
            Random rand = new Random();
            if (rand.nextInt(100) <= PERCENT_CREATE_NEW_ROOM) {
                this.nextRooms.put(direction, new Map(this, direction, 1,player, this.posX, this.posY));
            }
        }
    }

    public Map(Map previousRoom, String previousRoomDirection, int layer,Player player, Integer oldposX, Integer oldposY) {
        Map.nbMap += 1;
        switch (previousRoomDirection) {
            case "north":
                this.nextRooms.put("south", previousRoom);
                this.posX = oldposX;
                this.posY = oldposY-1;
                this.previousMapDirection = "south";
                break;
            case "south":
                this.nextRooms.put("north", previousRoom);
                this.posX = oldposX;
                this.posY = oldposY+1;
                this.previousMapDirection = "north";

                break;
            case "west":
                this.nextRooms.put("east", previousRoom);
                this.posX = oldposX-1;
                this.posY = oldposY;
                this.previousMapDirection = "east";
                break;
            case "east":
                this.nextRooms.put("west", previousRoom);
                this.posX = oldposX + 1;
                this.posY = oldposY;
                this.previousMapDirection = "west";
                break;
        }
        if (layer != FINAL_LAYER) {
            for (String direction : DIRECTIONS) {
                if (this.nextRooms.containsKey(direction)) continue;
                Random rand = new Random();
                if (rand.nextInt(100) <= PERCENT_CREATE_NEW_ROOM) {
                    this.nextRooms.put(direction, new Map(this, direction, layer+1,player, posX, posY));
                }
            }
        }

        this.trap = new Trap("hole",10);
        this.fight = new Fight(new Monster(200,50,200,"vampire"),player);
        //this.fight = new Fight(new Monster(200,60,20,"zombie"),new Player(130,100,200,new ArrayList<>(0),"ToinouTheMachine",new ConsoleView()));
        this.chest = new Chest(item);
    }

    public void visitMap() {
        if(!this.getAlreadyVisited()) {
            this.setAlreadyVisited(true);
        }
    }

    public void drawRoom(Graphics graphics){
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.SCENE_DUNGEON), 0, 0, 1500, 800, null);
    }

//    public void drawEnnemy(Graphics graphics, Player player){
//        if(Objects.equals(player.getCurrentRoom(), this)&& Objects.equals(player., fight)){
//
//            graphics.drawImage(Ressource.TEXTURES.get(Ressource.ENEMY_ZOMBIE), 450, 400, 350, 350, null);
//        }
//        else if (Objects.equals(player.getCurrentRoom(), this)&& Objects.equals(player.getCurrentRoom(), trap)){
//            graphics.drawImage(Ressource.TEXTURES.get(Ressource.TRAP), 450, 400, 350, 350, null);
//        }
//        else if(Objects.equals(player.getCurrentRoom(), this)&& Objects.equals(player.getCurrentRoom(), chest)){
//            graphics.drawImage(Ressource.TEXTURES.get(Ressource.CHEST), 450, 400, 350, 350, null);
//        }
//
//    }

    public void drawMap(Graphics g, Player player) {
        if(Objects.equals(player.getCurrentRoom(), this)){
            g.drawImage(Ressource.TEXTURES.get(Ressource.PIXEL_RED), this.posX * 20 + 1350, this.posY * 20 + 100, 20, 20, null);
        }else{
            g.drawImage(Ressource.TEXTURES.get(Ressource.PIXEL), this.posX * 20 + 1350, this.posY * 20 + 100, 20, 20, null);

        }
        for (String key : this.nextRooms.keySet()) {
            if (key.equals(this.previousMapDirection)){
                continue;
            }
            this.nextRooms.get(key).drawMap(g,player);
        }

    }


    public Map getNorthRoom() {
        return this.nextRooms.get("north");
    }
    public Map getSouthRoom() {
        return this.nextRooms.get("south");
    }
    public Map getEastRoom() {
        return this.nextRooms.get("east");
    }
    public Map getWestRoom() {
        return this.nextRooms.get("west");
    }




    public Boolean getAlreadyVisited() {
        return isAlreadyVisited;
    }

    public void setAlreadyVisited(Boolean alreadyVisited) {
        isAlreadyVisited = alreadyVisited;
    }
}