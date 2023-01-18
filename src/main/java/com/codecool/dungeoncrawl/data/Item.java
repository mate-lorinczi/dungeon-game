package com.codecool.dungeoncrawl.data;

import com.codecool.dungeoncrawl.data.actors.Player;
import com.codecool.dungeoncrawl.data.doors.LEVEL;

public abstract class Item implements Drawable {

    private Cell cell;
    private LEVEL level;

    public Item() {
        this.cell = null;
    }

    public Item(Cell cell) {
        this.cell = cell;
        this.cell.setItem(this);
    }

    public Item(Cell cell, LEVEL level) {
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

    public LEVEL getLevel() {
        return this.level;
    }
}
