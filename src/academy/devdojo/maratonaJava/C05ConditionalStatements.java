package academy.devdojo.maratonaJava;

public class C05ConditionalStatements {
    public static void main(String[] args) {
        int age = 12;
        boolean isAllowedToBuyAlcohol = age >= 18;
        if(isAllowedToBuyAlcohol) {
            System.out.println("Allowed to buy alcohol");
        }
        else {
            System.out.println("Sorry, you are not allowed to buy alcohol");
        }
        // !
        if(!isAllowedToBuyAlcohol) {
            System.out.println("Sorry, you are not allowed to buy alcohol");
        }
        System.out.println("Outside if");
    }
}
