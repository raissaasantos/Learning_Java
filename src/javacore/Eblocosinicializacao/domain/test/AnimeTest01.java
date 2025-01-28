package javacore.Eblocosinicializacao.domain.test;

import javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Anime");
        System.out.println(anime.getName());
        System.out.println(anime.getEpisodes());
    }
}
