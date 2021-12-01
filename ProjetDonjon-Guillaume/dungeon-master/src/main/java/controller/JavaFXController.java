package controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import model.*;

public class JavaFXController {
        EventHandler<? super KeyEvent> moveKeyPressEventHandler;
        public Item item;

        JavaFXController(Player player){
                moveKeyPressEventHandler = (EventHandler<KeyEvent>) event -> {
                        switch (event.getCode()) {
//                                case UP:    player.exploreNorth(player); break;
//                                case DOWN:  player.exploreSouth(player); break;
//                                case LEFT:  player.exploreWest(player); break;
//                                case RIGHT: player.exploreEast(player); break;
//                                case NUMPAD1:  player.use(Potion.DAMAGEPOTION); break;
//                                case NUMPAD2:  player.use(Potion.HEALPOTION); break;
//                                case NUMPAD3:  player.use(Weapon.SWORDWEAPON); break;
//                                case NUMPAD4:  player.use(Weapon.BOWWEAPON); break;
//                                case V: player.getVitality(); break;
                        }

                };
        }

}