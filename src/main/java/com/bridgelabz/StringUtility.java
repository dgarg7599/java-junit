package com.bridgelabz;

public class StringUtility {

    public String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

    public boolean isPalindrome(String s) {
        if(s == null) return false;
        String reversed = reverse(s);
        return s.equals(reversed);
    }

    public String toUpperCase(String s) {
        if(s == null) return null;
        return s.toUpperCase();
    }
}
