package com.codecool.dungeoncrawl.data.actors;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.MovementTypes;

public class Skeleton extends Monster {
    public Skeleton(Cell cell, MovementTypes movementType, int Health) {
        super(cell, movementType, Health);
    }

    @Override
    public String getTileName() {
        return "skeleton";
    }

}
