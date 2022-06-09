package com.dad.math;

public class Math {
    public static int roundUp(double value) {
        return (int) value + (value != (int) (value) ? 1 : 0);
    }
}
