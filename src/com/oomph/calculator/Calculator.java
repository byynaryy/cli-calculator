package com.oomph.calculator;

import java.util.Stack;

public class Calculator {
    public static void calculate(String calculation) {
        String[] items = calculation.split("(?<=[+\\-*/])|(?=[+\\-*/])");

        Stack<Integer> digits = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for(String item: items) {
            if(item.matches("\\d+")) {
                digits.push(Integer.parseInt(item));
            } else {
                ops.push(item.charAt(0));
            }
        }
        System.out.println(ops.get(1));



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
