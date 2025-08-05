package javacore.Hheranca.dominio;

public class Person{
    private String name;
    private String cpf;
    private Address address;

    public void printing(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.address.getStreet()+" "+this.address.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}