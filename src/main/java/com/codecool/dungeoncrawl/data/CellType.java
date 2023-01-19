package com.codecool.dungeoncrawl.data;

import java.util.List;
import java.util.stream.Stream;

public enum CellType {
    EMPTY("empty"),
    FLOOR("floor"),
    WALL("wall"),
    TREE("tree"),
    CHAIN("chain"),
    CARABINER("carabiner"),
    BRIDGE("bridge"),
    TORCH("torch"),
    GRASS("grass"),
    SKELETON("skeleton"),
    OGRE("ogre"),
    FIRE("fire"),
    STAIR("stair"),
    BASEMENT("basement"),
    CANDLE("candle"),
    GRAVESTONE("grave"),
    BONES("bones"),
    LADDER("ladder"),
    TOWER("tower"),
    DOOR("closed door"),
    G("g"),
    A("a"),
    M("m"),
    E("e"),
    O("o"),
    V("v"),
    R("r"),
    STAIRS("stairs");

    private final String tileName;

    CellType(String tileName) {
        this.tileName = tileName;
    }

    public String getTileName() {
        return tileName;
    }

    public static Stream<CellType> getRestrictedCells() {
        return Stream.of(CellType.EMPTY,CellType.BASEMENT,  CellType.TOWER, CellType.BONES, CellType.GRAVESTONE, CellType.CANDLE, CellType.FIRE, CellType.WALL, CellType.TORCH, CellType.CARABINER, CellType.CHAIN, CellType.DOOR, CellType.TREE);
    }
}
