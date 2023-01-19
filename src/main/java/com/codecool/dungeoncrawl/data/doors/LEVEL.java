package com.codecool.dungeoncrawl.data.doors;

public enum LEVEL {
    LEVEL1(0),
    LEVEL2(1),
    LEVEL3(2);

    private final int levelNum;

    LEVEL(int levelNum) {
        this.levelNum = levelNum;
    }

    public int getLevelNum() {
        return levelNum;
    }
}
