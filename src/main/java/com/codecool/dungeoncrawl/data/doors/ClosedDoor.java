package com.codecool.dungeoncrawl.data.doors;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.CellType;
import com.codecool.dungeoncrawl.data.items.Item;
import com.codecool.dungeoncrawl.data.actors.Player;
import com.codecool.dungeoncrawl.data.items.Key;

public class ClosedDoor extends Item {

    private Key key;

    public ClosedDoor(Cell cell, Key key) {
        super(cell);
        this.key = key;
    }

    @Override
    public String getTileName() {
        return "closed door";
    }

    @Override
    public void itemAction(Player player) {
        if(player.checkInventory(this.key)) {
            Cell cell = super.getCell();
            cell.setType(CellType.FLOOR);
            cell.setItem(null);
            new OpenDoor(super.getCell());
        }
    }
}
