package com.codecool.dungeoncrawl.data.actors;

import com.codecool.dungeoncrawl.data.Cell;

public class Player extends Actor {
    private
    public Player(Cell cell) {
        super(cell);
    }

    public String getTileName() {
        return "player";
    }
}
