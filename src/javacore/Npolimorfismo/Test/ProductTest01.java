package javacore.Npolimorfismo.Test;

import javacore.Npolimorfismo.dominio.Computer;
import javacore.Npolimorfismo.dominio.Tomato;
import javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell G15", 5000);
        Tomato tomato = new Tomato("Cherry tomato", 10);

        TaxCalculator.calculateComputerTax(computer);
        System.out.println("----------------------------------------------");
        TaxCalculator.calculateTomatoTax(tomato);
    }
}
