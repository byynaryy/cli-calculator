package com.oomph.calculator;


public class Main {
    static void main() {
        Calculator calc = new Calculator();
        while (true) {
            String calculation = IO.readln("Enter your calculation: ").trim();
            if (calculation.equalsIgnoreCase("quit")) break;
            if (calculation.isEmpty()) continue;
            if (!Validator.isValid(calculation)) continue;
            calc.calculate(calculation);
        }
    }
}
