package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Player;
import javacore.Gassociacao.dominio.Team;

import java.util.SortedMap;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Ryan");
        Team team = new Team("Group1");
        Player[] players = {player};

        player.setTeam(team);
        team.setPlayers(players);

        System.out.println("============ Player ============");

        player.printing();

        System.out.println("=========== Team ============");

        team.printing();

    }
}
