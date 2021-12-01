package model;

public class Trap {

    private String Traptype;



    private int Damage;

    public Trap(String traptype, int damage) {
        Traptype = traptype;
        Damage = damage;
    }

    public int getDamage() {
        return Damage;
    }


    public void GetTrapped(Player player){

        player.setVitality(player.getVitality() - this.getDamage());
        System.out.println("You take " + getDamage() + " trap damage");
        if(!player.isAlive()){
            System.out.println("You die");
        }

    }



}