package com.codecool.dungeoncrawl.data;

import com.codecool.dungeoncrawl.data.actors.Player;

public abstract class Item implements Drawable {

    private Cell cell;

    public Item(Cell cell) {
        this.cell = cell;
        this.cell.setItem(this);
    }

    abstract public void itemAction(Player player);
    public Cell getCell() {
        return cell;
    }
}
