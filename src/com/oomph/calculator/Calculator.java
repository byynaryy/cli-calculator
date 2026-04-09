package com.oomph.calculator;

import java.util.Stack;

public class Calculator {
    public int calculate(String calculation) {
        String[] elements = calculation.split("(?<=[+\\-*/])|(?=[+\\-*/])");

        Stack<Integer> digits = new Stack<>();
        Stack<Character> ops = new Stack<>();
        char op = ' ';

        for(String element: elements) {
            if(element.matches("\\d+")) {
                digits.push(Integer.parseInt(element));
            } else {
                op = element.charAt(0);
                ops.push(op);
            }
        }

        return evaluate(digits, op);

    }

    private int evaluate(Stack<Integer> digits, char op) {
        int result;
        int b = digits.pop();
        int a = digits.pop();

        result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new IllegalArgumentException("Unknown operator: " + op);
        };

        return result;

    }

}
