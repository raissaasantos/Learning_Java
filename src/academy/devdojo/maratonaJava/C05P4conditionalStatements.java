package academy.devdojo.maratonaJava;

public class C05P4conditionalStatements {
    public static void main(String[] args) {

        double annualSalary = 70000;
        double firstBracket = 9.70 / 100;
        double secondBracket = 37.35 / 100;
        double thirdBracket = 49.50 / 100;
        double amountToBePaid;
        if (annualSalary < 34712){
            amountToBePaid = annualSalary * firstBracket;
        }
        else if (annualSalary >= 34713 && annualSalary <= 68587) {
            amountToBePaid = annualSalary * secondBracket;
        }
        else {
            amountToBePaid = annualSalary * thirdBracket;
        }
        System.out.println(amountToBePaid);
    }
}
