package controller;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

public class Ressource {
    public static final byte PLAYER_ARCHER = 0;
    public static final byte PLAYER_SORCERER = 1;
    public static final byte PLAYER_SWORDSMAN = 2;
    public static final byte ENEMY_GOBBLIN = 3;
    public static final byte ENEMY_ZOMBIE = 4;
    public static final byte HEART = 5;
    public static final byte ARMOR = 6;
    public static final byte POTION_HEAL = 7;
    public static final byte POTION_STRENGH = 8;
    public static final byte PIXEL = 9;
    public static final byte PIXEL_RED = 10;
    public static final byte PIXEL_PURPLE = 11;
    public static final byte SCENE_DUNGEON = 11;
    public static final byte CHEST = 12;
    public static final byte TRAP = 13;
    public static final byte BOW = 14;
    public static final byte SWORD = 15;
    public static final byte LOST = 16;
    public static final byte WIN = 17;


    public static final ArrayList<BufferedImage> TEXTURES = new ArrayList<>();
}
