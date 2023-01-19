package com.codecool.dungeoncrawl.data.actors;

import com.codecool.dungeoncrawl.data.Cell;
import com.codecool.dungeoncrawl.data.MovementTypes;

public class ToiletMonster extends Monster{

    public ToiletMonster(Cell cell, MovementTypes movementType, int Health) {
        super(cell, movementType, Health);
    }

    @Override
    public String getTileName() {
        return "toilet";
    }
}
