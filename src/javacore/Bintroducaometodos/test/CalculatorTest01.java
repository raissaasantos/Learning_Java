package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculator;

import static javacore.Bintroducaometodos.dominio.Calculator.minusTwoNumbers;
import static javacore.Bintroducaometodos.dominio.Calculator.sumTwoNumbers;

public class CalculatorTest01 {
    public static void main(String[] args) {
        //Calculator calculadora = new Calculator();

        int resultSum = sumTwoNumbers(10, 10);
        System.out.println(resultSum);
        int resultSub = minusTwoNumbers(20,10);
       System.out.println(resultSub);
    }


}
