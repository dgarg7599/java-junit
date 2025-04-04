package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilsTest {

    private NumberUtils numberUtils;

    @BeforeEach
    void setUp(){
        numberUtils = new NumberUtils();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void shouldReturnTrueForEvenNumbers(int number) {
        Assertions.assertTrue(numberUtils.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testIsEven_FalseForOddNumbers(int number) {
        Assertions.assertFalse(numberUtils.isEven(number));
    }


}
