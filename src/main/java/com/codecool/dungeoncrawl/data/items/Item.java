package com.codecool.dungeoncrawl.data.items;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.Drawable;
import com.codecool.dungeoncrawl.data.actors.Player;
import com.codecool.dungeoncrawl.data.doors.LEVEL;

public abstract class Item implements Drawable {

    private Cell cell;
    private int level;

    public Item() {
        this.cell = null;
    }

    public Item(Cell cell) {
        this.cell = cell;
        this.cell.setItem(this);
    }

    public Item(Cell cell, int level) {
        this.cell = cell;
        this.cell.setItem(this);
        this.level = level;
    }

    abstract public void itemAction(Player player);
    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public int getLevel() {
        return this.level;
    }
}
