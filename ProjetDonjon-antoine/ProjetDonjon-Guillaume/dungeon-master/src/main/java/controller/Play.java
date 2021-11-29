package controller;

import model.Map;
import model.Player;
import model.Potion;
import model.Weapon;
import view.ConsoleView;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Play extends GameState{

    Player player;


    protected Play(GameStateManager manager) {
        super(manager);
        this.player = new Player(120,100,120,new ArrayList<>() ,"ToinouTheMachine",new ConsoleView());
    }

    @Override
    protected void loop() {

    }

    @Override
    protected void render(Graphics graphics) {
        this.player.render(graphics);
//        map.render(graphics);

//        graphics.setColor(Color.WHITE);
//        graphics.drawImage(Ressource.TEXTURES.get(Ressource.PLAYER_SWORDSMAN), 400, 200, 80, 80, null);

        graphics.setFont(new Font("arial", Font.PLAIN, 15));
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.HEART), 0, 0, 30, 30, null);
        graphics.drawString(player.getVitality()+"/"+player.getMaxVitality(), 12, 20);
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.ARMOR), 80, 0, 30, 30, null);
        graphics.drawString(this.player.getStrength()+"", 8, 20);
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.POTION_HEAL), 500, 400, 30, 30, null);
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.POTION_STRENGH), 300, 400, 30, 30, null);


    }

    @Override
    protected void keyPressed(int keyCode) {
        switch(keyCode) {
            case KeyEvent.VK_Z:
                player.exploreNorth(player);
                break;
            case KeyEvent.VK_Q:
                player.exploreWest(player);
                break;
            case KeyEvent.VK_S:
                player.exploreSouth(player);
                break;
            case KeyEvent.VK_D:
                player.exploreEast(player);
                break;
            case KeyEvent.VK_1:  player.use(Potion.DAMAGEPOTION); break;
            case KeyEvent.VK_2:  player.use(Potion.HEALPOTION); break;
            case KeyEvent.VK_3:  player.use(Weapon.SWORDWEAPON); break;
            case KeyEvent.VK_4:  player.use(Weapon.BOWWEAPON); break;
            case KeyEvent.VK_V: player.getVitality(); break;
        }
    }

    @Override
    protected void keyReleased(int keyCode) {
    }
}
