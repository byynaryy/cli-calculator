package com.oomph.calculator;


public class Main {
    static void main() {
        String calculation = IO.readln("Enter your calculation: ").trim();
        Calculator.calculate(calculation);

    }
}
