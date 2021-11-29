package model;

import controller.Ressource;
import view.View;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;


public class Player extends GameCharacter{
    private ArrayList<Item> inventory;
    private String  name;
    private View view;
    private Map currentRoom;
    private static final int PERCENT_CHOICE_TO_FIGHT = 50;
    private static final int PERCENT_CHOICE_TO_HAVE_CHEST = 20;


    public String getName() {
        return name;
    }

    public Player(int vitality, int strength,int maxVitality,ArrayList<Item> inventory,String name, View view) {
        super(vitality, strength,maxVitality);
        this.name = name;
        this.inventory = inventory;
        this.view = view;


    }

    public void exploreNorth(Player player) {
        if (this.getCurrentRoom().getNorthRoom() != null) {
            this.setCurrentRoom(this.getCurrentRoom().getNorthRoom());
            if(!this.currentRoom.getAlreadyVisited()) {
                Map.nbMapVisited += 1;
                this.currentRoom.setAlreadyVisited(true);
                this.currentRoom.trap.GetTrapped(player);
                Random rand = new Random();
                if (rand.nextInt(100) <= PERCENT_CHOICE_TO_FIGHT) {
                    this.currentRoom.fight.battle();
                }
                if (rand.nextInt(100) <= PERCENT_CHOICE_TO_HAVE_CHEST) {
                    this.currentRoom.chest.open(player);
                }
                if(Map.nbMapVisited == Map.nbMap){
                    System.out.println("Game Over You Win");
                }
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
                Map.nbMapVisited += 1;
                this.currentRoom.setAlreadyVisited(true);
                this.currentRoom.trap.GetTrapped(player);
                Random rand = new Random();
                if (rand.nextInt(100) <= PERCENT_CHOICE_TO_FIGHT) {
                    this.currentRoom.fight.battle();
                }
                if (rand.nextInt(100) <= PERCENT_CHOICE_TO_HAVE_CHEST) {
                    this.currentRoom.chest.open(player);
                }
                if(Map.nbMapVisited == Map.nbMap){
                    System.out.println("Game Over You Win");
                }
            }
            System.out.println("you're going to south room.");
        } else {
            System.out.println("You're facing a wall !");
        }
    } // public void exploreSouth()

    public void exploreEast(Player player) {
        if (this.getCurrentRoom().getEastRoom() != null) {
            this.setCurrentRoom(this.getCurrentRoom().getEastRoom());
            if(!this.currentRoom.getAlreadyVisited()) {
                Map.nbMapVisited += 1;
                this.currentRoom.setAlreadyVisited(true);
                this.currentRoom.trap.GetTrapped(player);
                Random rand = new Random();
                if (rand.nextInt(100) <= PERCENT_CHOICE_TO_FIGHT) {
                    this.currentRoom.fight.battle();
                }
                if (rand.nextInt(100) <= PERCENT_CHOICE_TO_HAVE_CHEST) {
                    this.currentRoom.chest.open(player);
                }
            }
            if(Map.nbMapVisited == Map.nbMap){
                System.out.println("Game Over You Win");
            }

            System.out.println("you're going to east room.");
        } else {
            System.out.println("You're facing a wall !");
        }
    } // public void exploreEast()

    public void exploreWest(Player player) {
        if (this.getCurrentRoom().getWestRoom() != null) {
            this.setCurrentRoom(this.getCurrentRoom().getWestRoom());
            if(!this.currentRoom.getAlreadyVisited()) {
                Map.nbMapVisited += 1;
                this.currentRoom.setAlreadyVisited(true);
                this.currentRoom.trap.GetTrapped(player);
                Random rand = new Random();
                if (rand.nextInt(100) <= PERCENT_CHOICE_TO_FIGHT) {
                    this.currentRoom.fight.battle();
                }
                if (rand.nextInt(100) <= PERCENT_CHOICE_TO_HAVE_CHEST) {
                    this.currentRoom.chest.open(player);
                }
                if(Map.nbMapVisited == Map.nbMap){
                    System.out.println("Game Over You Win");
                }
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

    public void use(Item item) {
        if (this.inventory.contains(item)) {
            if (item == Potion.HEALPOTION) {
                this.setVitality(this.getVitality() + item.getValue());
                this.inventory.remove(item);
                System.out.println("Use " + item.getType());
            }
            if (item == Potion.DAMAGEPOTION) {
                this.setStrength(this.getStrength() + item.getValue());
                this.inventory.remove(item);
                System.out.println("Use " + item.getType());
            }
            if (item == Weapon.BOWWEAPON) {
                this.setStrength(this.getStrength() + item.getValue());
                this.inventory.remove(item);
                System.out.println("Use " + item.getType());
            }
            if (item == Weapon.SWORDWEAPON) {
                this.setStrength(this.getStrength() + item.getValue());
                this.inventory.remove(item);
                System.out.println("Use " + item.getType());
            }
        }
    }

    public void render(Graphics graphics){
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.PLAYER_SWORDSMAN), 400, 200, 80, 80, null);

    }
    public Map getCurrentRoom() {
        return currentRoom;
    }
    public void setCurrentRoom(Map currentRoom) {
        this.currentRoom = currentRoom;
    }

}