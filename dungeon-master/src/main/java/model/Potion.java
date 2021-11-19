package model;

public class Potion implements Item{

    private int value ;
    private String type;

    public Potion(int value, String type) {
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