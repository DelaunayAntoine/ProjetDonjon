package view;

import javafx.scene.text.*;
import model.Move;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class JavaFXView implements View{

    public Text text = new Text(100,100,"Nothing");

    public void handleMove(Move move){
        text.setText(move.message);
    }


}