package controller;
import javax.swing.*;

import controller.Load;
import controller.Routeur;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Load.load();
                Routeur.init();
                Routeur.start();
            }
        });
    }
}
