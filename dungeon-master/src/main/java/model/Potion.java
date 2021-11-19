package model;

public enum Potion implements Item{
    DAMAGEPOTION(10, "damage potion"),
    HEALPOTION(20,"heal potion");

    private int value ;
    private String type;

     Potion(int value, String type) {
        this.value = value;
        this.type = type;
    }



    public String getType() {

        return type;
    }


    public int getValue() {

        return value;
    }
}