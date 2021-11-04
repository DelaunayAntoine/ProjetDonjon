package controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import model.Player;

public clagoNorthss JavaFXController {
    EventHandler<? super KeyEvent> eventHandler;

    JavaFXController(Player player){

     eventHandler = new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent event) {
            switch (event.getCode()) {
                case UP:    player.ExploreNorth(); break;
                case DOWN:  player.ExploreSouth(); break;
                case LEFT:  player.ExploreWest(); break;
                case RIGHT: player.ExploreEast(); break;
            }
        }
    }; }
}
