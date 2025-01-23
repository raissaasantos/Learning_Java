package javacore.Csobrecargametodos.dominio;

public class Anime {
    private String name;
    private String type;
    private int episodes;

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
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
}
