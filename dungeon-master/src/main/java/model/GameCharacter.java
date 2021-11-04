package model;


abstract public  class GameCharacter {
    private int vitality;
    private int strength;
    private int maxVitality;


    public GameCharacter(int vitality, int strength, int maxVitality) {

        this.strength = strength;
        this.vitality = vitality;
        this.maxVitality = maxVitality;
    }
    
}