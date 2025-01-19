package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest05 {
    public static void main(String... args) {
        Calculator calculator = new Calculator();
        int [] numbers = {1, 2, 3, 4, 5};
        calculator.sumArray(numbers);
        calculator.sumArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
