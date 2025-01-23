package javacore.Bintroducaometodos.dominio;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public void  print(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salaries);

        for(double salary: salaries){
            System.out.println(salary + " ");
        }
        printAverage();
    }

    public void printAverage(){
        for (double salary: salaries){
            average += salary;
        }
        average /= salaries.length;
        System.out.println("\nAverage: "+ average);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public double getAverage() {
        return average;
    }
}
