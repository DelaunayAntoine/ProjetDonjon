package controller;

import model.Player;


import java.awt.*;
import java.awt.event.KeyEvent;

public class Play extends GameState{

    private Player player;

    protected Play(GameStateManager manager) {
        super(manager);
//        this.player = new Player();
    }

    @Override
    protected void loop() {

    }

    @Override
    protected void render(Graphics graphics) {
//        this.player.render(graphics);

        graphics.setColor(Color.WHITE);
        graphics.setFont(new Font("arial", Font.PLAIN, 15));
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.HEART), 0, 0, 8, 8, null);
        graphics.drawString(this.player.getVitality()+"/"+this.player.getMaxVitality(), 12, 20);
        graphics.drawImage(Ressource.TEXTURES.get(Ressource.ARMOR), 80, 0, 8, 8, null);
        graphics.drawString(this.player.getStrength()+"", 8, 20);

    }

    @Override
    protected void keyPressed(int keyCode) {
        switch(keyCode) {
            case KeyEvent.VK_Z:
                this.player.exploreNorth(player);
                break;
            case KeyEvent.VK_Q:
                this.player.exploreWest(player);
                break;
            case KeyEvent.VK_S:
                this.player.exploreSouth(player);
                break;
            case KeyEvent.VK_D:
                this.player.exploreEast(player);
                break;
        }
    }

    @Override
    protected void keyReleased(int keyCode) {
    }
}
