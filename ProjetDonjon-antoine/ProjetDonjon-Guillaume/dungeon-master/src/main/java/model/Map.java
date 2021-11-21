package model;

import jdk.swing.interop.SwingInterOpUtils;
import view.ConsoleView;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Map {

    private java.util.Map<String, Map> nextRooms = new HashMap<String, Map>();
    private static final List<String> DIRECTIONS  = Arrays.asList("north", "south", "east", "west");
    private static final int PERCENT_CREATE_NEW_ROOM = 50;
    private static final int FINAL_LAYER = 6;
    private Boolean isAlreadyVisited = false;
    private Map currentRoom;
    public Fight fight;
    public Chest chest;
    public Item item;


    public Map(Player player) {
        for (String direction : DIRECTIONS) {
            if (this.nextRooms.containsKey(direction)) continue;
            Random rand = new Random();
            if (rand.nextInt(100) <= PERCENT_CREATE_NEW_ROOM) {
                this.nextRooms.put(direction, new Map(this, direction, 1,player));
            }
        }
    }
    public Map(Map previousRoom, String previousRoomDirection, int layer,Player player) {
        switch (previousRoomDirection) {
            case "north":
                this.nextRooms.put("south", previousRoom);
                break;
            case "south":
                this.nextRooms.put("north", previousRoom);
                break;
            case "west":
                this.nextRooms.put("east", previousRoom);
                break;
            case "east":
                this.nextRooms.put("west", previousRoom);
                break;
        }
        if (layer != FINAL_LAYER) {
            for (String direction : DIRECTIONS) {
                if (this.nextRooms.containsKey(direction)) continue;
                Random rand = new Random();
                if (rand.nextInt(100) <= PERCENT_CREATE_NEW_ROOM) {
                    this.nextRooms.put(direction, new Map(this, direction, layer+1,player));
                }
            }
        }

        this.fight = new Fight(new Monster(200,10,20,"vampire"),new Player(130,100,200,new ArrayList<>(0),"ToinouTheMachine",new ConsoleView()));
        this.chest = new Chest(item);
        // COMBAT + TRESOR
        // rand création combat
    }

    public void visitMap() {
        if(!this.getAlreadyVisited()) {
            this.setAlreadyVisited(true);
        }
        //this.currentRoom.fight.battle();
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

    public Map getCurrentRoom() {
        return currentRoom;
    }
    public void setCurrentRoom(Map currentRoom) {
        this.currentRoom = currentRoom;
    }


    public Boolean getAlreadyVisited() {
        return isAlreadyVisited;
    }

    public void render(Graphics graphics){
//        graphics.drawImage("dungeon-master/src/main/Asset/SwordMan.png", 0,0,null);
        graphics.setColor(new Color(60, 60, 60));
    }



    public void setAlreadyVisited(Boolean alreadyVisited) {
        isAlreadyVisited = alreadyVisited;
    }
}