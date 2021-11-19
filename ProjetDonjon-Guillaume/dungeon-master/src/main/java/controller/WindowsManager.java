package controller;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

import java.awt.event.KeyListener;
import java.awt.*;

public class WindowsManager {

    private JFrame frame;
    private JPanel panel;

    public static final int WIDTH = 800;
    public static final int HEIGHT = 450;

    public WindowManager() {
        this.frame = new JFrame("Dungeon project");
        this.frame.setBounds(70, 70, 0, 0);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setResizable(false);
    }

    public void addPanel(JPanel panel) {
        this.panel = panel;
        this.panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.panel.setFocusable(true);
        this.panel.requestFocusInWindow();
    }

    public void createWindow() {
        this.frame.setContentPane(panel);
        this.frame.pack();
        this.frame.setVisible(true);
    }
}
