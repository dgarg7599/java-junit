package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {

    StringUtility str;

    @BeforeEach
    void setUp(){
        str = new StringUtility();
    }

    @Test
    public void shouldReverseString(){
        Assertions.assertEquals("cba", str.reverse("abc"));
        Assertions.assertEquals("4321", str.reverse("1234"));
        Assertions.assertEquals("!@#", str.reverse("#@!"));
    }

    @Test
    public void shouldCheckPalindrome(){
        Assertions.assertTrue(str.isPalindrome("madam"));
        Assertions.assertTrue(str.isPalindrome("racecar"));
        Assertions.assertFalse(str.isPalindrome("hello"));
        Assertions.assertFalse(str.isPalindrome(null));  // Test for null
    }

    @Test
    public void shouldConvertStringToUppercase(){
        Assertions.assertEquals("HELLO", str.toUpperCase("hello"));
        Assertions.assertEquals("DIVYANSH", str.toUpperCase("divyansh"));
    }
}
