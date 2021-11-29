package controller;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image ;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Map;
import model.Player;
import view.ConsoleView;
import view.JavaFXView;
import view.View;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

public class App extends Application {
    /*
    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     *
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages.
     * @throws Exception if something goes wrong
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        JavaFXView view = new JavaFXView();
        /* //Afficher une image
        Canvas startCanvas = new Canvas(900,900);
        GraphicsContext gc = startCanvas.getGraphicsContext2D();
        Image start = new Image("/Archer.png");
        gc.drawImage(start,0,0);
        */

        Text message = view.text;
        root.getChildren().add(message);
        root.getChildren().add(new Canvas(400,200));
        Scene scene = new Scene(root);


        Player player = new Player(120,100,120,new ArrayList<>() ,"ToinouTheMachine",new ConsoleView());
        Map map = new Map(player);
        player.setCurrentRoom(map);
        map.visitMap();


        JavaFXController javaFXController = new JavaFXController(player);
        scene.setOnKeyPressed(javaFXController.moveKeyPressEventHandler);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}