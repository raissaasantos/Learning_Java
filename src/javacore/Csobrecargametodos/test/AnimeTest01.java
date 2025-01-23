package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setName("The Dark Princess");
        anime.setType("TV");
        anime.setEpisodes(12);
        anime.imprime();

    }
}
