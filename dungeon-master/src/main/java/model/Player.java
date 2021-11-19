package model;

import view.View;
import java.util.ArrayList;


public class Player extends GameCharacter{
    private ArrayList<Item> inventory;
    private String  name;
    private View view;
    private Map currentRoom;
    private Fight fight;



    public String getName() {
        return name;
    }

    public Player(int vitality, int strength,int maxVitality,ArrayList<Item> inventory,String name, View view) {
        super(vitality, strength,maxVitality);
        this.name = name;
        this.inventory = inventory;
        this.view = view;


    }

    public void exploreNorth() {
        if (this.getCurrentRoom().getNorthRoom() != null) {
            this.setCurrentRoom(this.getCurrentRoom().getNorthRoom());
            if(!this.currentRoom.getAlreadyVisited()) {
                this.currentRoom.setAlreadyVisited(true);
                this.currentRoom.fight.battle();
            }
            System.out.println("you're going to north room.");
        } else {
            System.out.println("You're facing a wall !");
        }
    } // public void exploreNorth()

    public void exploreSouth(Player player) {
        if (this.getCurrentRoom().getSouthRoom() != null) {
            this.setCurrentRoom(this.getCurrentRoom().getSouthRoom());
            if(!this.currentRoom.getAlreadyVisited()) {
                this.currentRoom.setAlreadyVisited(true);
                this.currentRoom.fight.battle();
                this.currentRoom.chest.open(player);
            }
            System.out.println("you're going to south room.");
        } else {
            System.out.println("You're facing a wall !");
        }
    } // public void exploreSouth()

    public void exploreEast() {
        if (this.getCurrentRoom().getEastRoom() != null) {
            this.setCurrentRoom(this.getCurrentRoom().getEastRoom());
            if(!this.currentRoom.getAlreadyVisited()) {
                this.currentRoom.setAlreadyVisited(true);
                this.currentRoom.fight.battle();
            }
            System.out.println("you're going to east room.");
        } else {
            System.out.println("You're facing a wall !");
        }
    } // public void exploreEast()

    public void exploreWest() {
        if (this.getCurrentRoom().getWestRoom() != null) {
            this.setCurrentRoom(this.getCurrentRoom().getWestRoom());
            if(!this.currentRoom.getAlreadyVisited()) {
                this.currentRoom.setAlreadyVisited(true);
                this.currentRoom.fight.battle();
            }
            System.out.println("you're going to west room.");
        } else {
            System.out.println("You're facing a wall !");
        }
    } // public void exploreWest()


    public void attack(GameCharacter monster){
        System.out.println("Player attack" );
        monster.setVitality(monster.getVitality() - this.getStrength());

    }

    public void addToInventory(Item item) {
        System.out.println(item  + " Item added");
        this.inventory.add(item);

    }

    public void use(Item item){
        if (this.inventory.contains(item)){
            int newVitality = this.getVitality() + item.getValue();
            this.setVitality(newVitality);
            this.inventory.remove(item);
            System.out.println("Use Item" );
        }
    }


    public Map getCurrentRoom() {
        return currentRoom;
    }
    public void setCurrentRoom(Map currentRoom) {
        this.currentRoom = currentRoom;
    }
}
