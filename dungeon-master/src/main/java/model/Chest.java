package model;

import java.util.Random;

public class Chest {
    Item item;
    Potion potion;
    Weapon weapon;
    private static final int PERCENT_CHOICE_DROP_SWORD = 30;
    private static final int PERCENT_CHOICE_DROP_BOW = 30;
    private static final int PERCENT_CHOICE_DROP_DAMAGEPOTION = 30;


    public Chest(Item item) {
        this.item = item;
    }


    public void open(Player player){
        Random rand = new Random();
        if (rand.nextInt(100) <= PERCENT_CHOICE_DROP_DAMAGEPOTION) {
            player.addToInventory(this.potion = Potion.HEALPOTION);
        }
        else {
            player.addToInventory(this.potion = Potion.DAMAGEPOTION);
        }
        if (rand.nextInt(100) <= PERCENT_CHOICE_DROP_SWORD) {
            player.addToInventory(this.weapon = Weapon.SWORDWEAPON);
        }
        if (rand.nextInt(100) <= PERCENT_CHOICE_DROP_BOW){
            player.addToInventory(this.weapon = Weapon.BOWWEAPON);

        }

        //player.addToInventory(item);
    }
}
