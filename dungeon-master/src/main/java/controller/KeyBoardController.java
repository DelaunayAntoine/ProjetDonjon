package controller;

import model.Item;
import model.Player;
import view.ConsoleView;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyBoardController {

    public void read() {
        Player player = new Player(130,100,200,new ArrayList<>(0)  ,"ToinouTheMachine",new ConsoleView());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter your move");
            switch (scanner.next()) {

                case "z":
                    player.ExploreNorth();
                    break;

                case "s":
                    player.ExploreNorth();
                    break;

                case "q":
                    player.ExploreNorth();
                    break;

                case "d":
                    player.ExploreNorth();
                    break;
            }

        }
    }
}
