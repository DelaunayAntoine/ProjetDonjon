package model;

import view.ConsoleView;
import view.View;
import java.util.ArrayList;

public class Player extends GameCharacter{
    ArrayList<Item> inventory;
    private String  name;


    public Player(int vitality, int strength,ArrayList<Item> inventory,String name ) {
        super(vitality, strength);
        this.name = name;
        this.inventory = inventory;
    }


}
