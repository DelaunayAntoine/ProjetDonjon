package model;

import view.ConsoleView;
import view.JavaFXView;
import view.View;
import java.util.ArrayList;
import model.Monster;
import model.GameCharacter;


public class Player extends GameCharacter{
    ArrayList<Item> inventory;
    private  String  name;
    View view ;


    public String getName() {
        return name;
    }

    public Player(int vitality, int strength,int maxVitality,ArrayList<Item> inventory,String name,View view ) {
        super(vitality, strength,maxVitality);
        this.name = name;
        this.inventory = inventory;
        this.view = view;
    }

    public void ExploreNorth() {

        view.handleMove(new Move("You face a wall"));

    }

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
        }

    }

}
