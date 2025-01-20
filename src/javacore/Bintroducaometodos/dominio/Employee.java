package javacore.Bintroducaometodos.dominio;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void  print(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salaries);

        for(double salary: salaries){
            System.out.println(salary + " ");
        }
    }

    public void printAverage(){
        double average = 0;
        for (double salary: salaries){
            average += salary;
        }
        average /= salaries.length;
        System.out.println("Average: "+ average);
    }
}
