package javacore.Gassociacao.test;

import java.util.Scanner;

public class KeyboardReadingTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter M for male and F for female: ");
        char sex = input.next().charAt(0);

        System.out.println("====================================");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Sex: "+sex);

        input.close();
    }
}
