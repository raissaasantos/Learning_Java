package javacore.Gassociacao.dominio;

public class Player {
    private String name;

    public void printing() {
        System.out.println(this.name);
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
