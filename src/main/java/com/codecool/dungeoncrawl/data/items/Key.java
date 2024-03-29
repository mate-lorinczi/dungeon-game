package com.codecool.dungeoncrawl.data.items;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.actors.Player;

public class Key extends Item {

    public Key(){}

    public Key(Cell cell) {
        super(cell);
    }

    @Override
    public void itemAction(Player player) {
        player.addItemsToInventory(this);
        this.getCell().setItem(null);
    }

    @Override
    public String getTileName() {
        return "key";
    }

    public void setCell(Cell cell) {
        super.setCell(cell);
    }
}
