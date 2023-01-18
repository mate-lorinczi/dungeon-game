package com.codecool.dungeoncrawl.data.actors;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.CellType;
import com.codecool.dungeoncrawl.data.Drawable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class Actor implements Drawable {
    private Cell cell;
    private int health = 10;


    private int strength;

    public Actor(Cell cell) {
        this.cell = cell;
        this.cell.setActor(this);
    }

    public void move(int dx, int dy) {

        Cell nextCell = cell.getNeighbor(dx, dy);
        if(moveRestriction(nextCell)) {
            cell.setActor(null);
            nextCell.setActor(this);
            cell = nextCell;
        }
    }

    private boolean moveRestriction(Cell nextCell) {
        Stream<CellType> restrictedTiles = CellType.getRestrictedCells();
        if(restrictedTiles.anyMatch(e -> e.getTileName().equals(nextCell.getTileName())) || nextCell.getActor() != null) {
            return false;
        }
        return true;
    }

    public int getHealth() {
        return health;
    }

    public Cell getCell() {
        return cell;
    }

    public int getX() {
        return cell.getX();
    }

    public int getY() {
        return cell.getY();
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

}
