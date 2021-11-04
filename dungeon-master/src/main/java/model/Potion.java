package model;

public class Potion implements Item{

    private int value ;
    private String type;

    public Potion(int value, String type) {
        this.value = value;
        this.type = type;
    }


    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getValue() {
        return value;
    }
}
