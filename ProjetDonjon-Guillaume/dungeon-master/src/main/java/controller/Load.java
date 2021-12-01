package controller;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Load {
    public static void load() {
        try {
            Ressource.TEXTURES.add(Ressource.PLAYER_ARCHER, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Archer.png")));
            Ressource.TEXTURES.add(Ressource.PLAYER_SORCERER, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Sorcerer.png")));
            Ressource.TEXTURES.add(Ressource.PLAYER_SWORDSMAN, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\SwordMan.png")));
            Ressource.TEXTURES.add(Ressource.ENEMY_GOBBLIN, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Goblin2.png")));
            Ressource.TEXTURES.add(Ressource.ENEMY_ZOMBIE, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\ZOMBIE.png")));
            Ressource.TEXTURES.add(Ressource.HEART, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\heart.png")));
            Ressource.TEXTURES.add(Ressource.ARMOR, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\armor.png")));
            Ressource.TEXTURES.add(Ressource.POTION_HEAL, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Potion-Sante.png")));
            Ressource.TEXTURES.add(Ressource.POTION_STRENGH, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Potion-Force.png")));
            Ressource.TEXTURES.add(Ressource.PIXEL, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Pixel-Noir.png")));
            Ressource.TEXTURES.add(Ressource.PIXEL_RED, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Pixel-Rouge.png")));
            Ressource.TEXTURES.add(Ressource.PIXEL_PURPLE, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Pixel-Violet.png")));
            Ressource.TEXTURES.add(Ressource.SCENE_DUNGEON, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Scene-Dungeon.png")));
            Ressource.TEXTURES.add(Ressource.CHEST, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Chest.png")));
            Ressource.TEXTURES.add(Ressource.TRAP, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Trap.png")));
            Ressource.TEXTURES.add(Ressource.BOW, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Bow.png")));
            Ressource.TEXTURES.add(Ressource.SWORD, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\Sword.png")));
            Ressource.TEXTURES.add(Ressource.LOST, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\You-lost.png")));
            Ressource.TEXTURES.add(Ressource.WIN, ImageIO.read(new File("dungeon-master\\src\\main\\Asset\\You-win.png")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
