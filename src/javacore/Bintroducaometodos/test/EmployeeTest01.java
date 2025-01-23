package javacore.Bintroducaometodos.test;


import javacore.Bintroducaometodos.dominio.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Eli");
        employee.setAge(24);
        employee.setSalaries(new double[]{1200, 987.32, 2500});

        employee.print();
        System.out.println(employee.getAverage());

    }
}
