package javacore.Gassociacao.dominio;

import java.sql.Time;

public class Team {
    private String name;

    private Player[] players;

    public Team(String name){
        this.name = name;
    }

    public Team(String name, Player[] players){
        this.name = name;
        this.players = players;
    }

    public void printing(){
        System.out.println(this.name);
        if (players == null) return;
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(Player[] players) {

    }
}
