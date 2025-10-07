package javacore.Npolimorfismo.dominio;

public class Television extends Product{
        public static final double TAX_PER_CENT = 0.50;
        public Television(String name, double value){
            super(name, value);
        }

        @Override
        public double calculateTax() {
            System.out.println("Calculating television's tax...");
            return this.value * TAX_PER_CENT;
        }
}
