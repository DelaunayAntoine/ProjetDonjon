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
    Map map;




    protected Play(GameStateManager manager) {
        super(manager);
        this.player = new Player(120,100,120,new ArrayList<>() ,"ToinouTheMachine",new ConsoleView());
        this.map = new Map(player);
        this.player.setCurrentRoom(map);
        this.map.visitMap();

    }

    @Override
    protected void loop() {

    }

    @Override
    protected void draw(Graphics graphics) {
        map.drawRoom(graphics);


//            this.player.renderBowman(graphics, player);
        this.player.renderSwordsman(graphics, player);
//        this.player.drawEnnemy(graphics);

        map.drawMap(graphics,player);
        map.drawEnnemy(graphics,player);
//        player.drawCombat(graphics);
//        map.drawEnnemy(graphics,player);
//        player.drawCombat(graphics);

        graphics.setColor(Color.WHITE);
        graphics.setFont(new Font("arial", Font.PLAIN, 65));

        graphics.drawImage(Ressource.TEXTURES.get(Ressource.HEART), 0, 0, 100, 100, null);
        graphics.drawString(this.player.getVitality()+"/"+ this.player.getMaxVitality(), 120, 65);
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.ARMOR), 350, 0, 100, 100, null);
        graphics.drawString(this.player.getStrength()+"", 450, 65);

        graphics.setFont(new Font("arial", Font.PLAIN, 35));
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.POTION_HEAL), 30, 250, 100, 100, null);
        graphics.drawString(player.displayInventory(Potion.HEALPOTION),150,325);
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.POTION_STRENGH), 30, 350, 100, 100, null);
        graphics.drawString(player.displayInventory(Potion.DAMAGEPOTION),150,425);
//        graphics.drawString(this.player.getInventory(),530,400);

        graphics.drawImage(Ressource.TEXTURES.get(Ressource.SWORD), 0, 450, 150, 100, null);
        graphics.drawString(player.displayInventory(Weapon.SWORDWEAPON),150,525);
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.BOW), 0, 550, 150, 150, null);
        graphics.drawString(player.displayInventory(Weapon.BOWWEAPON),150,625);
        if(!this.player.isAlive()){
            graphics.drawImage(Ressource.TEXTURES.get(Ressource.LOST), 0, 0, 1500, 800, null);
        }

        player.drawVictory(graphics);

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
            case KeyEvent.VK_P:
                player.use(Potion.DAMAGEPOTION);
                break;
            case KeyEvent.VK_O:
                player.use(Potion.HEALPOTION);
                break;
            case KeyEvent.VK_I:
                player.use(Weapon.SWORDWEAPON);
                break;
            case KeyEvent.VK_U:
                player.use(Weapon.BOWWEAPON);
                break;

        }
    }

    @Override
    protected void keyReleased(int keyCode) {
        switch(keyCode) {
            case KeyEvent.VK_Z:
                break;
            case KeyEvent.VK_Q:
                break;
            case KeyEvent.VK_S:
                break;
            case KeyEvent.VK_D:
                break;
            case KeyEvent.VK_1:
                break;
            case KeyEvent.VK_2:
                break;
            case KeyEvent.VK_3:
                break;
            case KeyEvent.VK_4:
                break;

        }
    }
}
