package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {

    private Division div;

    @BeforeEach
    void setUp() {
        div = new Division();
    }

    @Test
    public void shouldThrowExceptionWhenDivision() {
        Assertions.assertEquals(8, div.divide(40, 5));
        Assertions.assertThrows(ArithmeticException.class, () -> div.divide(5, 0), "Arithmetic Exception when divided by 0");
    }
}
