package academy.devdojo.maratonaJava;

public class C27Loops {
    public static void main(String[] args) {
        // while, do while, for

        int count = 0;
        while(count < 10){
            System.out.println(count);
            count++;
        }

        //Result does not matter, it will be executed at least once
        do{
            System.out.println("Dentro do while");
        }
        while (count < 10);

        for(int i = 0; i < 10; i ++){
            System.out.println("For "+i);
        }
    }
}
