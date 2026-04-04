package com.oomph.calculator;

public class Calculator {
    public static void calculate(String calculation) {
        String[] items = calculation.split("(?<=[+\\-*/])|(?=[+\\-*/])");
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
}
