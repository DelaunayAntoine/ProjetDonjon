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
                                case UP:    player.exploreNorth(); break;
                                case DOWN:  player.exploreSouth(); break;
                                case LEFT:  player.exploreWest(); break;
                                case RIGHT: player.exploreEast(); break;
                        }
                };
        }

}
