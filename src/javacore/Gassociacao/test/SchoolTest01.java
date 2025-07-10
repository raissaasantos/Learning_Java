package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Ladedus");
        Professor professor2 = new Professor("Lari Bia");
        Professor[] professors = {professor, professor2};
        School school = new School("Wizard", professors);

        school.printing();

    }
}
