package controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import model.Item;
import model.Map;
import model.Player;
import model.Potion;

public class JavaFXController {
        EventHandler<? super KeyEvent> moveKeyPressEventHandler;
        public Item item;

        JavaFXController(Player player){
                moveKeyPressEventHandler = (EventHandler<KeyEvent>) event -> {
                        switch (event.getCode()) {
                                case UP:    player.exploreNorth(player); break;
                                case DOWN:  player.exploreSouth(player); break;
                                case LEFT:  player.exploreWest(player); break;
                                case RIGHT: player.exploreEast(player); break;
                                case SPACE:  player.use(item); break;
                                case V: player.getVitality(); break;
                        }

                };
        }

}