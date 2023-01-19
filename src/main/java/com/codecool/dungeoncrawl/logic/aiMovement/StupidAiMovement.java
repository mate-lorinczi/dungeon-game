package com.codecool.dungeoncrawl.logic.aiMovement;

import com.codecool.dungeoncrawl.data.GameMap;
import com.codecool.dungeoncrawl.data.actors.Actor;
import com.codecool.dungeoncrawl.data.actors.Monster;

import java.util.Random;

public class StupidAiMovement implements MovementType{

    private Random random;

    public StupidAiMovement(Random random) {
        this.random = random;
    }

    @Override
    public void calculateMovement(Monster monster, GameMap map) {
        monster.move(0, 0);
    }
}
