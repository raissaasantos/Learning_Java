package javacore.Dconstrutores.dominio;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String estudio;

    public Anime(String name, String type, int episodes, String gender){
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public Anime(String name, String type, int episodes, String gender, String estudio){
        this(name, type, episodes, gender);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("No arguments");
    }

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
        System.out.println(this.estudio);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
