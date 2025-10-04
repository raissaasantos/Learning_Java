package javacore.Npolimorfismo.service;

import javacore.Npolimorfismo.dominio.Computer;
import javacore.Npolimorfismo.dominio.Tomato;

public class TaxCalculator {
    public static void calculateComputerTax(Computer computer){
        System.out.println("Computer's tax report");
        double tax = computer.calculateTax();
        System.out.println("Computer's tax "+computer.getName());
        System.out.println("Value "+computer.getValue());
        System.out.println("Tax to be paid "+tax);
    }

    public static void calculateTomatoTax(Tomato tomato){
        System.out.println("Tomato's tax report");
        double tax = tomato.calculateTax();
        System.out.println("Tomato's tax "+tomato.getName());
        System.out.println("Value "+tomato.getValue());
        System.out.println("Tax to be paid "+tax);
    }
}
