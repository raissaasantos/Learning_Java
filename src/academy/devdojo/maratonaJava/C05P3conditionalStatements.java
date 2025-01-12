package academy.devdojo.maratonaJava;

public class C05P3conditionalStatements {
    public static void main(String[] args) {

        // if salary > 2000 "buy laptop" "don't buy laptop"
        double salary = 35880;
        String shouldBuyMessage = "buy laptop";
        String shouldNotBuyMessage = "don't buy laptop";
        // (condition) ? <true> : <false>
        String displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;

        System.out.println(displayMessage);
    }
}
