package javacore.Kenumeracao.test;

import javacore.Kenumeracao.dominio.Client;
import javacore.Kenumeracao.dominio.ClientType;
import javacore.Kenumeracao.dominio.PaymentType;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Kirill", ClientType.PESSOA_FISICA, PaymentType.DEBITO);
        Client client2 = new Client("Aiden", ClientType.PESSOA_JURIDICA, PaymentType.CREDITO);
        System.out.println(client1);
        System.out.println(client2);
    }
}
