package com.codecool.dungeoncrawl.data.doors;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.CellType;
import com.codecool.dungeoncrawl.data.actors.Player;
import com.codecool.dungeoncrawl.data.items.Item;
import com.codecool.dungeoncrawl.data.items.Key;

public class SecretDoor extends Item {
    private Key key;

    public SecretDoor(Cell cell, Key key, int level) {
        super(cell, level);
        this.key = key;
    }

    @Override
    public String getTileName() {
        return "secret door";
    }

    @Override
    public void itemAction(Player player) {
            Cell cell = super.getCell();
            cell.setType(CellType.STAIRS);
    }
}
