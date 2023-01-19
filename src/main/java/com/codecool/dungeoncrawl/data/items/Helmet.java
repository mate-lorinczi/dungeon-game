package com.codecool.dungeoncrawl.data.items;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.actors.Player;

public class Helmet extends Item {


    public Helmet(Cell cell) {
        super(cell);
    }

    public void itemAction(Player player) {
        player.addItemsToInventory(this);
        player.setHealth(player.getHealth() + 15);
        this.getCell().setItem(null);
    }

    public String getTileName() {
        return "helmet";
    }
}