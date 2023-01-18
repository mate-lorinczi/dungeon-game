package com.codecool.dungeoncrawl.data;

import java.util.stream.Stream;

public enum CellType {
    EMPTY("empty"),
    FLOOR("floor"),
    WALL("wall"),
    ITEM("item"),
    KEY("key");

    private final String tileName;

    CellType(String tileName) {
        this.tileName = tileName;
    }

    public String getTileName() {
        return tileName;
    }

    public static Stream<CellType> getRestrictedCells() {
        return Stream.of(CellType.EMPTY, CellType.WALL);
    }
}
