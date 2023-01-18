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
    GRASS("grass"),
    SKELETON("skeleton"),
    DOOR("closed door");

    private final String tileName;

    CellType(String tileName) {
        this.tileName = tileName;
    }

    public String getTileName() {
        return tileName;
    }

    public static Stream<CellType> getRestrictedCells() {
        return Stream.of(CellType.EMPTY, CellType.WALL, CellType.CARABINER, CellType.CHAIN, CellType.DOOR, CellType.TREE);
    }
}
