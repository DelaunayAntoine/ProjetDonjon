package model;

public enum Weapon implements Item {

    SWORDWEAPON(20, "Sword"),
    BOWWEAPON(10,"Bow");

     Weapon(int value, String type) {
        this.value = value;
        this.type = type;
    }

    private int value ;
    private String type;

    public String getType() {

        return type;
    }

    public int getValue() {

        return value;
    }
}
