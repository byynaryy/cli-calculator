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
                char op = element.charAt(0);
                while (!ops.empty()) {
                    if(isLowPrecedence(ops.peek())) break;
                    evaluate(digits, ops.pop());
                }
                ops.push(op);
            }
        }

        while (!ops.empty()) {
            evaluate(digits, ops.pop());
        }

        return digits.pop();

    }

    private boolean isLowPrecedence(char op) {
        return op == '+' || op == '-';
    }

    private void evaluate(Stack<Integer> digits, char op) {
        int b = digits.pop();
        int a = digits.pop();

        switch (op) {
            case '+' -> digits.push(a + b);
            case '-' -> digits.push(a - b);
            case '*' -> digits.push(a * b);
            case '/' -> digits.push(a / b);
            default -> throw new IllegalArgumentException("Unknown operator: " + op);
        }
    }

}
