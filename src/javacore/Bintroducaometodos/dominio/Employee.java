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
            System.out.println(salary + "");
        }
    }
}
