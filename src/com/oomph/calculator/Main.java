package com.oomph.calculator;


public class Main {
    static void main() {
        String calculation = IO.readln("Enter your calculation: ").trim();
        String[]  items = calculation.split("(?<=[+\\-*/])|(?=[+\\-*/])");
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
