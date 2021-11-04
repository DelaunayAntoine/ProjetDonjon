package model;

import model.GameCharacter;
import model.Player;
import model.Monster;

public class Fight {
    public Monster monster;
    public Player player;


    public Fight(Monster monster, Player player) {
        this.monster = monster;
        this.player = player;
    }

    
}
