package com.dad.rouletteboulette2;

public enum EvenOdd {
    NONE(0),
    ODD(1),
    EVEN(2);
    public final int value;
    private EvenOdd(int value){
        this.value = value;
    }
}
