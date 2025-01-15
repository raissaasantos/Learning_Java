package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(20, 2);
        System.out.println(result);
    }
}
