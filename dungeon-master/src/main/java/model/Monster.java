package model;

public class Monster extends GameCharacter{
    private String Type;


    public Monster(int vitality, int strength,String Type) {
        super(vitality, strength);
        this.Type = Type;
    }
}
