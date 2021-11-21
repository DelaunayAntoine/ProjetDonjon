package controller;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

public class Ressource {
    public static final byte FLOOR = 0;
    public static final byte STONE = 1;
    public static final byte WALL = 2;
    public static final byte TILE = 3;
    public static final byte GRASS = 4;
    public static final byte PLAYER_ARCHER = 5;
    public static final byte PLAYER_SORCERER = 6;
    public static final byte PLAYER_SWORDSMAN = 7;
    public static final byte STAIRS = 13;
    public static final byte CHEST = 14;
    public static final byte ENEMY_GOBBLIN = 15;
    public static final byte ENEMY_ZOMBIE = 16;
    public static final byte ATTACK = 17;
    public static final byte HEART = 18;
    public static final byte ARMOR = 19;
    public static final byte GOLD = 20;

    public static final HashMap<String, BufferedImage> ROOMS = new HashMap<>();
    public static final ArrayList<BufferedImage> TEXTURES = new ArrayList<>();
}
