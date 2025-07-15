package javacore.Gassociacao.test;

import java.util.Scanner;

public class KeyboardReadingTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Oraclee");
        System.out.println("Enter your question and I'll answer yes or no");
        String question = input.nextLine();
        if (question.charAt(0) == ' '){
            System.out.println("Yes");
        }else {
            System.out.println("Nooo");
        }

        input.close();
    }
}
