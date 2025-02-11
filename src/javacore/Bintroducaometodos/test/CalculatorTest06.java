package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest06 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int test = 2;
        int test2 = 10;
        System.out.println(calculator.numPrimo(test));
        System.out.println("--------------------------------");
        System.out.println(calculator.numPrimo(test2));
    }
}
