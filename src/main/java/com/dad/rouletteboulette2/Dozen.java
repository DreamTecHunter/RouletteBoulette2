package com.dad.rouletteboulette2;

public enum Dozen {
    NONE(0),
    DOZEN1(1),
    DOZEN2(2),
    DOZEN3(3);
    public final int value;

    private Dozen(int value) {
        this.value = value;
    }
}
