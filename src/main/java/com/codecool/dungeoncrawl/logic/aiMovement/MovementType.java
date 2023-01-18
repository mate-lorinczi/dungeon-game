package com.codecool.dungeoncrawl.logic.aiMovement;

import com.codecool.dungeoncrawl.data.GameMap;
import com.codecool.dungeoncrawl.data.actors.Actor;
import com.codecool.dungeoncrawl.data.actors.Monster;

public interface MovementType {

     void calculateMovement(Monster monster, GameMap map);
}
