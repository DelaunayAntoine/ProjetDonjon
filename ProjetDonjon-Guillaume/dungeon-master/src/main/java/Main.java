import javax.swing.*;
import controller.Routeur;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Routeur.init();
                Routeur.start();
            }
        });
    }
}
