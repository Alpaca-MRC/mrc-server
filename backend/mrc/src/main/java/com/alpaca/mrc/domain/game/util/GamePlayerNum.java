package com.alpaca.mrc.domain.game.util;

public enum GamePlayerNum {
    SINGLE(1),
    MULTI_TWO(2),
    MULTI_THREE(3),
    MULTI_FOUR(4);

    private final int playerLimit;

    GamePlayerNum(int playerLimit) {
        this.playerLimit = playerLimit;
    }
}

