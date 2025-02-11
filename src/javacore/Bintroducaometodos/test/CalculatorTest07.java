package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculator;

import java.util.Arrays;

public class CalculatorTest07 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] test = {1, 2, 3};
        int[] result = calculator.doubleArray(test);
        System.out.println(Arrays.toString(result));
    }
}
