package com.codecool.dungeoncrawl.data.doors;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.actors.Player;
import com.codecool.dungeoncrawl.data.items.Item;

public class OpenDoor extends Item {

    public OpenDoor(Cell cell) {
        super(cell);
        super.getCell().setItem(this);
    }

    @Override
    public String getTileName() {
        return "open door";
    }

    @Override
    public void pickUp(Player player) {}
}
