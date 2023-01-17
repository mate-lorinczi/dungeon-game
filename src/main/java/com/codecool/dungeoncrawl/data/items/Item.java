package com.codecool.dungeoncrawl.data.items;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.Drawable;
import com.codecool.dungeoncrawl.data.actors.Actor;
import com.codecool.dungeoncrawl.data.actors.Player;

import javax.swing.text.PlainDocument;

public abstract class Item implements Drawable {
    private Cell cell;

    public Item() {}

    public Item(Cell cell) {
        this.cell = cell;
        this.cell.setItem(this);
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Cell getCell() {
        return cell;
    }

    public abstract void pickUp(Player player);


}
