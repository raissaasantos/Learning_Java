package javacore.Eblocosinicializacao.domain;

import org.w3c.dom.ls.LSOutput;

public class Anime {
    private String name;
    private int[] episodes = {1,2,3,4,5,6,7,8,9,10,11,12};

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
        for (int episodes: this.episodes){
            System.out.print(episodes+" ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
