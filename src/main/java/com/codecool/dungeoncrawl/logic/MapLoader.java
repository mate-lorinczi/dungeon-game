package com.codecool.dungeoncrawl.logic;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.CellType;
import com.codecool.dungeoncrawl.data.GameMap;
import com.codecool.dungeoncrawl.data.items.Sword;
import com.codecool.dungeoncrawl.data.actors.Player;
import com.codecool.dungeoncrawl.data.actors.Skeleton;
import com.codecool.dungeoncrawl.data.doors.ClosedDoor;
import com.codecool.dungeoncrawl.data.items.Key;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class MapLoader {

    private static HashMap<String, Key> createKeys() {
        HashMap<String, Key> keyMap = new HashMap<>();
        keyMap.put("Key1", new Key());
        return keyMap;
    }

    public static GameMap loadMap() {
        HashMap<String, Key> keys = createKeys();
        InputStream is = MapLoader.class.getResourceAsStream("/map.txt");
        Scanner scanner = new Scanner(is);
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        scanner.nextLine(); // empty line

        GameMap map = new GameMap(width, height, CellType.EMPTY);
        for (int y = 0; y < height; y++) {
            String line = scanner.nextLine();
            for (int x = 0; x < width; x++) {
                if (x < line.length()) {
                    Cell cell = map.getCell(x, y);
                    switch (line.charAt(x)) {
                        case ' ':
                            cell.setType(CellType.EMPTY);
                            break;
                        case '#':
                            cell.setType(CellType.WALL);
                            break;
                        case 't':
                            cell.setType(CellType.TREE);
                            break;
                        case 'i':
                            cell.setType(CellType.FLOOR);
                            new Sword(cell);
                            break;
                        case '.':
                            cell.setType(CellType.FLOOR);
                            break;
                        case 'g':
                            cell.setType(CellType.GRASS);
                            break;
                        case 'b':
                            cell.setType(CellType.BRIDGE);
                            break;
                        case 'c':
                            cell.setType(CellType.CHAIN);
                            break;
                        case 'a':
                            cell.setType(CellType.CARABINER);
                            break;
                        case 's':
                            cell.setType(CellType.FLOOR);
                            new Skeleton(cell);
                            break;
                        case '@':
                            cell.setType(CellType.FLOOR);
                            map.setPlayer(new Player(cell));
                            break;
                        case 'k':
                            cell.setType(CellType.FLOOR);
                            Key key = keys.get("Key1");
                            key.setCell(cell);
                            cell.setItem(key);
                            break;
                        case 'd':
                            cell.setType(CellType.DOOR);
                            new ClosedDoor(cell, keys.get("Key1"));
                            break;
                        default:
                            throw new RuntimeException("Unrecognized character: '" + line.charAt(x) + "'");
                    }
                }
            }
        }
        return map;
    }

}
