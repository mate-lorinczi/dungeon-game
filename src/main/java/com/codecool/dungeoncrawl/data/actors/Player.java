package com.codecool.dungeoncrawl.data.actors;

import com.codecool.dungeoncrawl.data.Cell;

import java.util.ArrayList;
import java.util.List;

public class Player extends Actor {
    List<Item> items;
    public Player(Cell cell) {
        super(cell);
        this.inventory = new ArrayList<>();
    }

    public String getTileName() {
        return "player";
    }

    @Override
    public void move(int dx, int dy) {
        Cell nextCell = super.getCell().getNeighbor(dx, dy);
        if(nextCell.getItem() != null) {
            nextCell.getItem().itemAction(this);
        }

        super.move(dx, dy);
    }

    public boolean checkInventory(Item item) {
        return inventory.contains(item);
    }

    public void addItemsToInventory(Item item) {
        items.add(item);
    }
}
