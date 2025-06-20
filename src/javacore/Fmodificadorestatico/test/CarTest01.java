package javacore.Fmodificadorestatico.test;

import javacore.Fmodificadorestatico.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car.setSpeedLimit(180);

        Car c1 = new Car("Audi",280);
        Car c2 = new Car("BMW",275);
        Car c3 = new Car("Porsche",290);

        c1.printing();
        c2.printing();
        c3.printing();
    }
}
