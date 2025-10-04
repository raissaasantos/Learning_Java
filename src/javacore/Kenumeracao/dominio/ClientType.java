package javacore.Kenumeracao.dominio;

public enum ClientType {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int value;
    private String relatoryName;
    ClientType(int value, String relatoryName){
        this.value = value;
        this.relatoryName = relatoryName;
    }

    public int getValue() {
        return value;
    }

    public String getRelatoryName() {
        return relatoryName;
    }
}