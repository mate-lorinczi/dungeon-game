package com.codecool.dungeoncrawl.data.items;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.Drawable;
import com.codecool.dungeoncrawl.data.actors.Player;

public abstract class Item implements Drawable {

    private Cell cell;

    public Item() {
        this.cell = null;
    }

    public Item(Cell cell) {
        this.cell = cell;
        this.cell.setItem(this);
    }

    abstract public void itemAction(Player player);
    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
