package com.oomph.calculator;

import java.util.Stack;

public class Calculator {
    public int calculate(String calculation) {
        String[] elements = calculation.split("(?<=[+\\-*/])|(?=[+\\-*/])");

        Stack<Integer> digits = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for(String element: elements) {
            if(element.matches("\\d+")) {
                digits.push(Integer.parseInt(element));
            } else {
                ops.push(element.charAt(0));
            }
        }

        return evaluate(digits, ops);

    }

    private int evaluate(Stack<Integer> digits, Stack<Character> ops) {
        int result;
        int a = digits.pop();
        int b = digits.pop();
        Character op = ops.pop();

        result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new IllegalArgumentException("Unknown operator: " + ops);
        };

        return result;

    }

}
