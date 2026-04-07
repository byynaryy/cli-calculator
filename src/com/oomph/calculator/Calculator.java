package com.oomph.calculator;

import java.util.Stack;

public class Calculator {
    public static void calculate(String calculation) {
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
        System.out.println(ops.get(0));

        int result;
        Character op = ops.get(0);
        int a = digits.pop();
        int b = digits.pop();
        System.out.println(a);
        System.out.println(b);

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Unknown operator: " + op);
        }
        System.out.println(result);
    }

}
