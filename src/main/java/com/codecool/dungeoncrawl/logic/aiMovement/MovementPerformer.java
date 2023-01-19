package com.codecool.dungeoncrawl.logic.aiMovement;

import com.codecool.dungeoncrawl.data.GameMap;
import com.codecool.dungeoncrawl.data.actors.Monster;

public class MovementPerformer {

    public void performMovement(Monster monster, GameMap map) {
        switch (monster.getMovementType()) {
            case Stupid:
                break;
            case Random:
                MovementType randomMovement = new RandomAiMovement();
                randomMovement.calculateMovement(monster, map);
                break;
        }
    }
}
