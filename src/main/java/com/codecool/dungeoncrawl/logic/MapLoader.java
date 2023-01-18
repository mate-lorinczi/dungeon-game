package com.codecool.dungeoncrawl.logic;

import com.codecool.dungeoncrawl.data.*;
import com.codecool.dungeoncrawl.data.actors.Player;
import com.codecool.dungeoncrawl.data.actors.Skeleton;
import com.codecool.dungeoncrawl.data.doors.ClosedDoor;
import com.codecool.dungeoncrawl.data.doors.LEVEL;
import com.codecool.dungeoncrawl.data.doors.ClosedStairs;
import com.codecool.dungeoncrawl.data.items.Key;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MapLoader {

    private static List<String> maps = List.of("/map.txt", "/level2.txt");

    private static HashMap<String, Key> createKeys() {
        HashMap<String, Key> keyMap = new HashMap<>();
        keyMap.put("Key1", new Key());
        keyMap.put("Key2", new Key());
        return keyMap;
    }
    public static GameMap loadMap(int level) {
        HashMap<String, Key> keys = createKeys();
        InputStream is = MapLoader.class.getResourceAsStream(maps.get(level));
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
                        case 'i':
                            cell.setType(CellType.FLOOR);
                            new Sword(cell);
                            break;
                        case '.':
                            cell.setType(CellType.FLOOR);
                            break;
                        case 's':
                            cell.setType(CellType.FLOOR);
                            new Skeleton(cell, MovementTypes.Stupid);
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
                        case 'l':
                            cell.setType(CellType.DOOR);
                            new ClosedStairs(cell, keys.get("Key2"), LEVEL.values()[level]);
                            break;
                        case '2':
                            cell.setType(CellType.FLOOR);
                            Key key2 = keys.get("Key2");
                            key2.setCell(cell);
                            cell.setItem(key2);
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
