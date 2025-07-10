package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Player;
import javacore.Gassociacao.dominio.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player01 = new Player("Ryan");
        Team team = new Team("Group007");

        player01.setTeam(team);
        player01.printing();
    }
}
