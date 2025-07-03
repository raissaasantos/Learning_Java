package javacore.Fmodificadorestatico.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    // 1. Alocado o espaço em memória para o objeto
    // 2. Cada atributo de classe e criado e inicializado com valores default ou que for passada
    // 3. Bloco de inicialização é executado
    // 4. Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++){
            episodes[i] = i+1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episodes: Anime.episodes){
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
