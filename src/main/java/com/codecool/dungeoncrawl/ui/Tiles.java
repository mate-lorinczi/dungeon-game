package com.codecool.dungeoncrawl.ui;

import com.codecool.dungeoncrawl.data.Drawable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class Tiles {
    public static int TILE_WIDTH = 32;

    private static Image tileset = new Image("/tiles.png", 543 * 2, 543 * 2, true, false);
    private static Map<String, Tile> tileMap = new HashMap<>();
    public static class Tile {
        public final int x, y, w, h;
        Tile(int i, int j) {
            x = i * (TILE_WIDTH + 2);
            y = j * (TILE_WIDTH + 2);
            w = TILE_WIDTH;
            h = TILE_WIDTH;
        }
    }

    static {
        tileMap.put("empty", new Tile(0, 0));
        tileMap.put("wall", new Tile(6, 13));
        tileMap.put("floor", new Tile(2, 0));
        tileMap.put("player", new Tile(27, 0));
        tileMap.put("skeleton", new Tile(29, 6));
        tileMap.put("ogre", new Tile(30, 6));
        tileMap.put("sword", new Tile(0,30));
        tileMap.put("key", new Tile(16, 23));
        tileMap.put("closed door", new Tile(8, 1));
        tileMap.put("open door", new Tile(8, 2));
        tileMap.put("tree", new Tile(1,1));
        tileMap.put("grass", new Tile(5,0));
        tileMap.put("chain",new Tile(12, 12) );
        tileMap.put("carabiner", new Tile(12,13));
        tileMap.put("bridge",new Tile(13,16));
        tileMap.put("torch", new Tile(4,15));
        tileMap.put("fire", new Tile( 14,10));
        tileMap.put("stair", new Tile(2, 6));
        tileMap.put("basement", new Tile(10,18));
        tileMap.put("candle", new Tile(5, 15));
        tileMap.put("grave", new Tile(1, 14));
        tileMap.put("bones", new Tile(0,15));
        tileMap.put("ladder", new Tile(21,1));
        tileMap.put("tower", new Tile(2,19));
        tileMap.put("stairs", new Tile(8, 2));
        tileMap.put("toilet", new Tile(12, 10));
        tileMap.put("secret door", new Tile(2,19));
        tileMap.put("potion", new Tile(18, 25));
        tileMap.put("helmet", new Tile(1, 22));
        tileMap.put("g", new Tile(25,30));
        tileMap.put("a", new Tile(19,30));
        tileMap.put("m", new Tile(31,30));
        tileMap.put("e", new Tile(23,30));
        tileMap.put("o", new Tile(20,31));
        tileMap.put("v", new Tile(27,31));
        tileMap.put("r", new Tile(23,31));
    }

    public static void drawTile(GraphicsContext context, Drawable d, int x, int y) {
        Tile tile = tileMap.get(d.getTileName());
        context.drawImage(tileset, tile.x, tile.y, tile.w, tile.h,
                x * TILE_WIDTH, y * TILE_WIDTH, TILE_WIDTH, TILE_WIDTH);
    }
}
