package com.codecool.dungeoncrawl.data.actors;

import com.codecool.dungeoncrawl.data.Cell;

public class Ogre extends Actor {
    public Ogre(Cell cell) {
        super(cell);
    }

    @Override
    public String getTileName() {
        return "ogre";
    }
}
