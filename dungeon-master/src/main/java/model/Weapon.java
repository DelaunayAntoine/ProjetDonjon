package model;

public class Weapon implements Item {

    public Weapon(int value, String type) {
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
