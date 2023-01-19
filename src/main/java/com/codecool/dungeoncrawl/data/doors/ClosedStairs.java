package com.codecool.dungeoncrawl.data.doors;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.CellType;
import com.codecool.dungeoncrawl.data.actors.Player;
import com.codecool.dungeoncrawl.data.items.Item;
import com.codecool.dungeoncrawl.data.items.Key;

public class ClosedStairs extends Item {
    private Key key;

    public ClosedStairs(Cell cell, Key key, int level) {
        super(cell, level);
        this.key = key;
    }

    @Override
    public String getTileName() {
        return "stairs";
    }

    @Override
    public void itemAction(Player player) {
        if(player.checkInventory(this.key)) {
            Cell cell = super.getCell();
            cell.setType(CellType.STAIRS);
        }
    }

}