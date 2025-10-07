package javacore.Npolimorfismo.service;

import javacore.Npolimorfismo.dominio.Product;

public class TaxCalculator {

    public static void calculateTax(Product product){
        System.out.println("Tax report");
        double tax = product.calculateTax();
        System.out.println("Product: "+product.getName());
        System.out.println("Price: "+product.getValue());
        System.out.println("Tax to be paid: "+tax);
    }
}
