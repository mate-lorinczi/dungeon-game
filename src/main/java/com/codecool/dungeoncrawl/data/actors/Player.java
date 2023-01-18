package com.codecool.dungeoncrawl.data.actors;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Player extends Actor {

    private List<Item> items = new ArrayList<>();

    public Player(Cell cell) {
        super(cell);
    }

    public String getTileName() {
        return "player";
    }


    public void addItemsToInventory(Item item) {
        items.add(item);
    }

    public void move(int dx, int dy) {
        Cell nextCell = super.getCell().getNeighbor(dx, dy);
        if (nextCell.getItem() != null) {
            nextCell.getItem().itemAction(this);
        }
        super.move(dx, dy);
    }

    public boolean checkInventory(Item item) {
        return items.contains(item);
    }
    public List<Item> getItems() {
        return items;
    }
}
