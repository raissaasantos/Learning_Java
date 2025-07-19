package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Place;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminar;
import javacore.Gassociacao.dominio.Student;

import java.util.Scanner;

public class AssociationTest {
    public static void main(String[] args) {

        Place place = new Place("Germany");
        Student student = new Student("Violet", 20);
        Professor professor = new Professor("Liam", "Rider");
        Student[] seminarStudents = {student};

        Seminar seminar = new Seminar("How to fight", seminarStudents, place);

        Seminar[] availableSeminars = {seminar};

        professor.setSeminars(availableSeminars);

        professor.printing();

    }
}
