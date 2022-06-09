package com.dad.rouletteboulette2;

import com.dad.math.Math;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.*;


public enum RouletteNumber {
    ZERO(0, GREEN),
    ONE(1, RED),
    TWO(2, BLACK),
    THREE(3, RED),
    FOUR(4, BLACK),
    FIVE(5, RED),
    SIX(6, BLACK),
    SEVEN(7, RED),
    EIGHT(8, BLACK),
    NINE(9, RED),
    TEN(10, BLACK),
    ELEVEN(11, BLACK),
    TWELVE(12, RED),
    THIRTEEN(13, BLACK),
    FOURTEEN(14, RED),
    FIFTEEN(15, BLACK),
    SIXTEEN(16, RED),
    SEVENTEEN(17, BLACK),
    EIGHTEEN(18, RED),
    NINETEEN(19, RED),
    TWENTY(20, BLACK),
    TWENTY_ONE(21, RED),
    TWENTY_TWO(22, BLACK),
    TWENTYTHREE(23, RED),
    TWENTYFOUR(24, BLACK),
    TWENTYFIVE(25, RED),
    TWENTYSIX(26, BLACK),
    TWENTYSEVEN(27, RED),
    TWENTYEIGHT(28, BLACK),
    TWENTYNINE(29, BLACK),
    THIRTY(30, RED),
    THIRTY_ONE(31, BLACK),
    THIRTY_TWO(32, RED),
    THIRTYTHREE(33, BLACK),
    THIRTYFOUR(34, RED),
    THIRTYFIVE(35, BLACK),
    THIRTYSIX(36, RED);

    public final int number;
    public final Column column;
    public final Dozen dozen;
    public final Color color;
    public final EvenOdd evenOdd;
    public final Eighteenth eighteenth;

    private RouletteNumber(double number, Color color) {
        this.number = (int) number;
        this.column = Column.values()[(int) (number != 0 ? 3 - ((number - 1) % 3) : 0)];
        this.dozen = Dozen.values()[number != 0 ? Math.roundUp(number / 12) : 0];
        this.color = color;
        this.evenOdd = EvenOdd.values()[(int) (number != 0 ? 2 - (number % 2) : 0)];
        this.eighteenth = Eighteenth.values()[number != 0 ? Math.roundUp(number / 18) : 0];
    }

}
