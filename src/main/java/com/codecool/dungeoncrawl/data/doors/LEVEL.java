package com.codecool.dungeoncrawl.data.doors;

public enum LEVEL {
    LEVEL1(1),
    LEVEL2(0);

    private final int levelNum;

    LEVEL(int levelNum) {
        this.levelNum = levelNum;
    }

    public int getLevelNum() {
        return levelNum;
    }
}
