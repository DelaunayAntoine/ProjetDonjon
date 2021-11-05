package model;

public class Chest {
    Item item;


    public Chest(Item item) {
        this.item = item;
    }

    public void open(Player player){
        player.addToInventory(item);
    }
}
