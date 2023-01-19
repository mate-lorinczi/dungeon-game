package com.codecool.dungeoncrawl.data.actors;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.MovementTypes;

public abstract class Monster extends Actor {

    public Monster(Cell cell, MovementTypes movementType) {
        super(cell);
        super.setMovementType(movementType);
    }

    public MovementTypes getMovementType() {
        return super.getMovementType();
    }
}
