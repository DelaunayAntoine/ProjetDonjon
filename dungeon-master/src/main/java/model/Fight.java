package model;

public class Fight {
    public Monster monster;
    public Player player;


    public Fight(Monster monster, Player player) {
        this.monster = monster;
        this.player = player;
    }

    public void battle(){
        while(player.getVitality() > 0 && monster.getVitality() > 0){
            this.player.attack(this.monster);
            if(monster.getVitality() >0){
                this.monster.attack(this.player);
            }
            if(this.player.isAlive() && !this.monster.isAlive()){
                System.out.println("You win");
            }
            if(!this.player.isAlive() && this.monster.isAlive()){
                System.out.println("You loose");

            }
        }
    }


}
