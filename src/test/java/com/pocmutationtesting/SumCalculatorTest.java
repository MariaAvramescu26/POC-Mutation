package com.pocmutationtesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {

    @Test
    public void calculate_whenFirstIsLessOrEqualThanZero_thenThrowException(){
        try {
            SumCalculator calculator = new SumCalculator();
            calculator.calculatePositive(0, 2);
        } catch(IllegalArgumentException calcException) {
            Assertions.assertEquals(calcException.getMessage(), "the first argument is less than 1");
            return;
        }
        Assertions.fail();
    }

    @Test
    public void calculate_whenSecondIsLessOrEqualThanZero_thenThrowException(){
        try {
            SumCalculator calculator = new SumCalculator();
            calculator.calculatePositive(3, 0);
        } catch(IllegalArgumentException calcException) {
         //   Assertions.assertEquals(calcException.getMessage(), "the second argument is less than 1");
            return;
        }
        Assertions.fail();
    }

    @Test
    public void calculate_whenFirstAndSecondIsBiggerThanZero(){
            SumCalculator calculator = new SumCalculator();
            int resultCalc = calculator.calculatePositive(3, 5);
           // Assertions.assertEquals(resultCalc, 8);
    }

}
