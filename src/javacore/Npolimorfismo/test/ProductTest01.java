package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computer;
import javacore.Npolimorfismo.dominio.Television;
import javacore.Npolimorfismo.dominio.Tomato;
import javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell G15", 5000);
        Tomato tomato = new Tomato("Cherry tomato", 10);
        Television tv = new Television("Samsung", 5200);

        TaxCalculator.calculateTax(computer);
        System.out.println("----------------------------------------------");
        TaxCalculator.calculateTax(tomato);
        System.out.println("----------------------------------------------");
        TaxCalculator.calculateTax(tv);
    }
}
