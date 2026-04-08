package com.oomph.calculator;

public class Validator {
    public static boolean isValid(String input) {
        // Rule1: no two operators in a row (e.g. "2 ++ 3")
        if (input.matches(".*[+\\-*/^]{2,}.*")) {
            System.out.println("Not valid: you have two operators in a row.");
            return false;
        }

        return true;
    }
}
