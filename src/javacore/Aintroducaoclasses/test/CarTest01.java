package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        car.name = "Porsche";
        car.model = "GT3 RS";
        car.year = 2024;

        car2.name = "BMW";
        car2.model = "320i";
        car2.year = 2020;

        System.out.println("Name: "+car.name+"\nModel: "+ car.model+"\nYear: "+car.year);
        System.out.println("----------------------------------------------------------");
        System.out.println("Name: "+car2.name+"\nModel: "+ car2.model+"\nYear: "+car2.year);
    }
}
