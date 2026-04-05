package com.oomph.calculator;

import java.util.Stack;

public class Calculator {
    public static void calculate(String calculation) {
        String[] items = calculation.split("(?<=[+\\-*/])|(?=[+\\-*/])");

        Stack<Integer> digits = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for(int i = 0; i <= items.length; i++) {
            if(isInt(items[i])) {
                digits.push(Integer.parseInt(items[i].trim()));
            } else {
                ops.push(items[i].trim());
            }
        }



        int a = Integer.parseInt(items[0].trim());
        String op = items[1].trim();
        int b = Integer.parseInt(items[2].trim());

        int result;

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Unknown operator: " + op);
        }
        System.out.println(result);
    }

    private static boolean isInt(String s) {
        try {
            Integer.parseInt(s.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
