package com.codecool.dungeoncrawl.logic;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.CellType;
import com.codecool.dungeoncrawl.data.GameMap;
import com.codecool.dungeoncrawl.data.actors.Monster;
import com.codecool.dungeoncrawl.data.actors.Player;
import com.codecool.dungeoncrawl.logic.aiMovement.MovementPerformer;

import java.util.ArrayList;
import java.util.List;

public class GameLogic {
    private GameMap map;
    private List<GameMap> maps;
    private MovementPerformer movementPerformer =  new MovementPerformer();

    public GameLogic() {
        this.map = MapLoader.loadMap(0);
        this.maps = new ArrayList<>();
        this.maps.add(map);
    }

    public double getMapWidth() {
        return map.getWidth();
    }

    public double getMapHeight() {
        return map.getHeight();
    }

    public void setup() {
    }

    public void update() {
        for (int y = 0; y < map.getHeight(); y++) {
            for (int x = 0; x < map.getWidth(); x++) {
                Cell currentCell = map.getCell(x,y);
                if(currentCell.getType().equals(CellType.STAIRS) && currentCell.getActor() != null) {
                    updateMap(currentCell.getItem().getLevel());
                    currentCell.getNeighbor(2, -1).setActor(map.getPlayer());
                    return;
                }
                if (map.getCell(x, y).getActor() instanceof Monster monster) {
                    movementPerformer.performMovement(monster, map);
                }
            }
        }
    }

    private void updateMap(int level) {
        System.out.println(level);
        maps.add(MapLoader.loadMap(level));
        map = maps.get(level);
    }

    public Cell getCell(int x, int y) {
        return map.getCell(x, y);
    }

    public String getPlayerHealth() {
        return Integer.toString(map.getPlayer().getHealth());
    }


    public GameMap getMap() {
        return map;
    }
}
