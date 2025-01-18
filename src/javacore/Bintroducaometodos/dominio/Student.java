package javacore.Bintroducaometodos.dominio;

public class Student {
    public String name;
    public int age;
    public char sex;

    public void printing(){
        System.out.println("-------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }
}
