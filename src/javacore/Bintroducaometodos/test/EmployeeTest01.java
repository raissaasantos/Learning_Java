package javacore.Bintroducaometodos.test;


import javacore.Bintroducaometodos.dominio.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Eli";
        employee.age = 24;
        employee.salaries = new double[]{1200, 987.32, 2500};

        employee.print();

    }
}
