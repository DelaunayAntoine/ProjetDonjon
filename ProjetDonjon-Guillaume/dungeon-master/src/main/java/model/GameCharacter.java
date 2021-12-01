package model;


abstract public  class GameCharacter {

    public int vitality ;
    private int strength ;
    private int maxVitality;


    public GameCharacter(int vitality, int strength, int maxVitality) {

        this.strength = strength;
        this.vitality = vitality;
        this.maxVitality = maxVitality;
    }
    public int getVitality() {

//        System.out.println(vitality); //debug
        return vitality;

    }

    public boolean isAlive(){

        return this.vitality > 0 ;
    }

    public int getStrength() {

        return strength;
    }


    public void setVitality(int vitality) {

        this.vitality = vitality;
    }

    public void setStrength(int strength) {

        this.strength = strength;
    }

    public void setMaxVitality(int maxVitality) {

        this.maxVitality = maxVitality;
    }

    public int getMaxVitality() {

//        System.out.println(maxVitality); //debug
        return maxVitality;
    }
}