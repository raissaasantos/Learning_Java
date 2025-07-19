package javacore.Gassociacao.dominio;

public class Professor {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public void printing() {
        System.out.println("===================");
        System.out.println("Professor: " + this.name);
        if (this.seminars == null) return;
        System.out.println("## Registered Seminars ##");
        for (Seminar seminar : this.seminars) {
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getPlace().getAddress());
            if (seminar.getStudents() == null) continue;
            System.out.println("** Students **");
            for (Student student : seminar.getStudents()) {
                System.out.println("Student: " + student.getName() + "\nIdade: " + student.getAge());
            }
        }
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
