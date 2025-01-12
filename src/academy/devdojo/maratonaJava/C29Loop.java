package academy.devdojo.maratonaJava;

public class C29Loop {
    public static void main(String[] args) {

        //Print the fist 25 numbers of a value. Ex: 50
        int maxValue = 50;
        for(int i = 0; i <= maxValue; i++){
            if (i > 25){
                break;
            }

            System.out.println(i);
        }
    }
}
