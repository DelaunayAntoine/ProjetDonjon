package controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import model.Map;
import model.Player;

public class JavaFXController {
        EventHandler<? super KeyEvent> moveKeyPressEventHandler;

        JavaFXController(Player player){
                moveKeyPressEventHandler = (EventHandler<KeyEvent>) event -> {
                        switch (event.getCode()) {
                                case UP:    player.exploreNorth(player); break;
                                case DOWN:  player.exploreSouth(player); break;
                                case LEFT:  player.exploreWest(player); break;
                                case RIGHT: player.exploreEast(player); break;
                        }
                };
        }

}
