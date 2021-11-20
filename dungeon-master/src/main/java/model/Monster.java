package model;

public class Monster extends GameCharacter{
    private String Type;



    public Monster(int vitality, int strength,int maxVitality,String Type) {
        super(vitality, strength,maxVitality);
        this.Type = Type;
    }

    public void attack(GameCharacter player){
        System.out.println("Monster attack" );
        player.setVitality(this.getVitality() - this.getStrength());
    }
}
