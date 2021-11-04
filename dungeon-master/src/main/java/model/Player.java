package model;

import view.ConsoleView;
import view.View;
import java.util.ArrayList;
import model.Monster;
import model.GameCharacter;


public class Player extends GameCharacter{
    ArrayList<Item> inventory;
    private String  name;


    public Player(int vitality, int strength,int maxVitality,ArrayList<Item> inventory,String name ) {
        super(vitality, strength,maxVitality);
        this.name = name;
        this.inventory = inventory;
    }

    public void attack(GameCharacter monster){
       System.out.println("Player attack" );
       monster.setVitality(monster.getVitality() - this.getStrength());

    }



}
