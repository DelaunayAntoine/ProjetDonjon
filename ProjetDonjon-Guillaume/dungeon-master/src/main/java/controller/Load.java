package controller;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Load {
    public static void load() {
        try {
            File texturesFolder = new File("dungeon-master/src/main/Asset");
            for(File imgFile : texturesFolder.listFiles()) {
                Ressource.ROOMS.put(imgFile.getName(), ImageIO.read(imgFile));
            }
            Ressource.TEXTURES.add(Ressource.FLOOR, ImageIO.read(new File("dungeon-master/src/main/Asset/floor.png")));
            Ressource.TEXTURES.add(Ressource.STONE, ImageIO.read(new File("dungeon-master/src/main/Asset/stone.png")));
            Ressource.TEXTURES.add(Ressource.WALL, ImageIO.read(new File("dungeon-master/src/main/Asset/wall.png")));
            Ressource.TEXTURES.add(Ressource.TILE, ImageIO.read(new File("dungeon-master/src/main/Asset/tile.png")));
            Ressource.TEXTURES.add(Ressource.GRASS, ImageIO.read(new File("dungeon-master/src/main/Asset/grass.png")));
            Ressource.TEXTURES.add(Ressource.PLAYER_ARCHER, ImageIO.read(new File("dungeon-master/src/main/Asset/Archer.png")));
            Ressource.TEXTURES.add(Ressource.PLAYER_SORCERER, ImageIO.read(new File("dungeon-master/src/main/Asset/Sorcerer.png")));
            Ressource.TEXTURES.add(Ressource.PLAYER_SWORDSMAN, ImageIO.read(new File("dungeon-master/src/main/Asset/SwordMan.png")));
            Ressource.TEXTURES.add(Ressource.STAIRS, ImageIO.read(new File("dungeon-master/src/main/Asset/stairs.png")));
            Ressource.TEXTURES.add(Ressource.CHEST, ImageIO.read(new File("dungeon-master/src/main/Asset/chest.png")));
            Ressource.TEXTURES.add(Ressource.ENEMY_GOBBLIN, ImageIO.read(new File("dungeon-master/src/main/Asset/Goblin2.png")));
            Ressource.TEXTURES.add(Ressource.ENEMY_ZOMBIE, ImageIO.read(new File("dungeon-master/src/main/Asset/ZOMBIE.png")));
            Ressource.TEXTURES.add(Ressource.ATTACK, ImageIO.read(new File("dungeon-master/src/main/Asset/attack.png")));
            Ressource.TEXTURES.add(Ressource.HEART, ImageIO.read(new File("dungeon-master/src/main/Asset/heart.png")));
            Ressource.TEXTURES.add(Ressource.ARMOR, ImageIO.read(new File("dungeon-master/src/main/Asset/armor.png")));
            Ressource.TEXTURES.add(Ressource.GOLD, ImageIO.read(new File("dungeon-master/src/main/Asset/gold.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
