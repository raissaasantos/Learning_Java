package academy.devdojo.maratonaJava;

import java.util.Scanner;

public class C30LoopBreakEx {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condition: valorParcela >= 1000

    public static void main(String[] args) {

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela + " R$ "+ valorParcela);
        }
    }
}
