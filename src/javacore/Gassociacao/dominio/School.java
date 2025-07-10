package javacore.Gassociacao.dominio;

public class School {
    private String name;
    private Professor[] professors;
    
    public void printing(){
        System.out.println(this.name);
        if(professors == null) return;
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }

    }

    public School(String name, Professor[] professores) {
        this.name = name;
        this.professors = professors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
