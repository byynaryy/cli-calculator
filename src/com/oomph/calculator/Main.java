package com.oomph.calculator;


public class Main {
    static void main() {
        String calculation = IO.readln("Enter your calculation: ");
        String[]  items = calculation.split("(?<=[+\\-*/])|(?=[+\\-*/])");
        int a = Integer.parseInt(items[0]);
        String op = items[1];
        int b = Integer.parseInt(items[2]);

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
