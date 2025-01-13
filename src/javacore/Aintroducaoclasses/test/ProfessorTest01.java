package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Kai Sokolov";
        professor.age = 32;
        professor.sex = 'M';

        System.out.println("Name: " + professor.name + "\nAge: "+ professor.age + "\nSex: " + professor.sex);

    }
}
