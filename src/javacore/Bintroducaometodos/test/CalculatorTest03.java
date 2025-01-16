package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(20, 2);
        System.out.println(result);
        System.out.println(calculator.divideTwoNumbers02(20,0));
        System.out.println("-----------------");
        calculator.printDivisionOfTwoNumbers(20,0);
    }
}
