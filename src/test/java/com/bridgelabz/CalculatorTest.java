package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp(){
        calc = new Calculator();
    }

    @Test
    public void shouldAdd(){
        Assertions.assertEquals(10, calc.add(5, 5));
        Assertions.assertEquals(7, calc.add(4, 3));
    }

    @Test
    public void shouldSubtract(){
        Assertions.assertEquals(3, calc.subtract(6, 3));
        Assertions.assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void shouldMultiply(){
        Assertions.assertEquals(15, calc.multiply(5, 3));
        Assertions.assertEquals(12, calc.multiply(4, 3));
    }

    @Test
    public void shouldDivide(){
        Assertions.assertEquals(3, calc.divide(9, 3));
//        Assertions.assertEquals(2, cal.divide(27,10));

        try {
            calc.divide(57, 0);
            Assertions.fail("Should throw ArithmeticException when dividing by zero");
        } catch (ArithmeticException e) {
            Assertions.assertEquals("Cannot divide by zero", e.getMessage());
        }

    }
}
