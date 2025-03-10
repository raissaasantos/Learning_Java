package javacore.Bintroducaometodos.dominio;

public class Calculator {

    public static int sumTwoNumbers(int number1, int number2){
        return number1 + number2;
    }

    public static int minusTwoNumbers(int number1, int number2){
        return number1 - number2;
    }

    public void multiplyTwoNumbers(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double divideTwoNumbers02(double num1, double num2){
        if (num2 != 0){
            return num1/num2;
        }
        else {
            return 0;
        }
    }

    public void printDivisionOfTwoNumbers(double num1, double num2){
        if(num2 == 0){
            System.out.println("No division by 0");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumArgs(int...numbers){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        System.out.println(sum);
    }

    //Desafio 1
    //Criar uma calculadora que verifica se um número é primo ou não.
    // Retorno: true se for primo, false caso contrário.

    public boolean numPrimo(int number) {
        if (number <= 1) {
            return false;
        }
        if (number > 2 && number % 2 == 0) {
            return false;
        }
        int limit = (int) Math.sqrt(number);
        for (int i = 2; i <= limit; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Desafio 2
    //Criar uma calculadora que recebe uma lista/array e retorna a lista com seus valores multiplicados por 2.
    //Ex: Se a entrada for [1, 2, 3], o retorno de [2, 4, 6]
    public int[] doubleArray(int[] itens){
            if (itens == null || itens.length == 0) {
                return new int[0];
            }

            int[] doubledItens = new int[itens.length];
            for (int i = 0; i < itens.length; i++) {
                doubledItens[i] = 2 * itens[i];
            }
            return doubledItens;
    }
}
