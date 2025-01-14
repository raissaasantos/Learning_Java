package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();
        calculadora.sumTwoNumbers();
        System.out.println("Finalizando CalculatorTest01");
        calculadora.minusTwoNumbers();
    }
}
