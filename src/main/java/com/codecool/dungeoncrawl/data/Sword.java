package com.codecool.dungeoncrawl.data;

import com.codecool.dungeoncrawl.data.actors.Player;

public class Sword extends Item {


    public Sword(Cell cell) {
        super(cell);
    }

    public void itemAction(Player player) {
        player.addItemsToInventory(this);
        player.setStrength(player.getStrength() + 10);
        this.getCell().setItem(null);
    }

    public String getTileName() {
        return "sword";
    }
}
