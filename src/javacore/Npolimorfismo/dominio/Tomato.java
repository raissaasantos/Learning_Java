package javacore.Npolimorfismo.dominio;

public class Tomato extends Product{
    public static final double TAX_PER_CENT =  0.06;
    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating tomato's tax");
        return this.value * TAX_PER_CENT;
    }
}
