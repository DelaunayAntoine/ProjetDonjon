package model;

import view.ConsoleView;
import view.View;
import java.util.ArrayList;

public class Player extends GameCharacter{
    ArrayList<Item> inventory;
    private String  name;


    public Player(int vitality, int strength,int maxVitality,ArrayList<Item> inventory,String name ) {
        super(vitality, strength,maxVitality);
        this.name = name;
        this.inventory = inventory;
    }


}
