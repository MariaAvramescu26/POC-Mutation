package com.pocmutationtesting;

import java.util.stream.Stream;

public class SumCalculator {

    public int calculatePositive(int first, int second) {

        if (first <= 0) {
            throw new IllegalArgumentException("the first argument is less than 1");
        }

        if (second <= 0) {
            throw new IllegalArgumentException("the second argument is less than 1");
        }

        return first + second;
    }

}
