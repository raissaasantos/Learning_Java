package javacore.Hheranca.test;


import javacore.Hheranca.dominio.Address;
import javacore.Hheranca.dominio.Employee;
import javacore.Hheranca.dominio.Person;

public class HerancaTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Nova Street");
        address.setCep("84233-44");
        Person person = new Person();
        person.setName("Rumi");
        person.setCpf("04832534554");
        person.setAddress(address);
        person.printing();

        System.out.println("==============================");

        Employee employee = new Employee();
        employee.setName("Mira");
        employee.setCpf("472828984");
        employee.setAddress(address);
        employee.setSalary(5000);
        employee.printing();


    }
}