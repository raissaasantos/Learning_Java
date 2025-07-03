package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player01 = new Player("Lia");
        Player player02 = new Player("Kai");
        Player player03 = new Player("Mia");

        Player[] players = new Player[]{player01, player02, player03};

        for (Player player : players) {
            player.printing();
        }

    }
}
