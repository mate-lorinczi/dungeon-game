package com.codecool.dungeoncrawl.logic.aiMovement;

import com.codecool.dungeoncrawl.data.GameMap;
import com.codecool.dungeoncrawl.data.actors.Actor;
import com.codecool.dungeoncrawl.data.actors.Monster;

import java.util.Random;

public class RandomAiMovement implements MovementType{

    Random random = new Random();

    @Override
    public void calculateMovement(Monster monster, GameMap map) {
        int x = random.nextInt(2 + 1) - 1;
        int y = random.nextInt(2 + 1) - 1;

        System.out.println(x);
        System.out.println(y);

        monster.move(x, y);
    }
}
