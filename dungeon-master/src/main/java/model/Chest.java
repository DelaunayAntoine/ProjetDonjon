package model;

public class Chest {
    Item item;
    Potion potion;



    public Chest(Item item) {
        this.item = item;
    }


    public void open(Player player){
       // player.addToInventory(this.potion = new Potion(20,"heal"));
        player.addToInventory(item);
    }
}
