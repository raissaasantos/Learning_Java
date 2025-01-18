package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.PrintStudent;
import javacore.Bintroducaometodos.dominio.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Nikolai";
        student01.age = 24;
        student01.sex = 'M';

        student02.name = "Anika";
        student02.age = 19;
        student02.sex = 'F';

        student01.printing();
        student02.printing();
    }
}
