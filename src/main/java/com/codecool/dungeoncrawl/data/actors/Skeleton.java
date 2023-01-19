package com.codecool.dungeoncrawl.data.actors;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.MovementTypes;

public class Skeleton extends Monster {
    public Skeleton(Cell cell, MovementTypes movementType) {
        super(cell, movementType);
    }


    @Override
    public String getTileName() {
        return "skeleton";
    }

}
