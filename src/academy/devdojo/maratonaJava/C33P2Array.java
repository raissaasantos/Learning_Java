package academy.devdojo.maratonaJava;

public class C33P2Array {
    public static void main(String[] args) {
        //Initial default
        //byte, short, int, long, float e double = 0
        // char '\u0000'
        //boolean = false
        // String = null

        String[] names = new String[3];
        names[0] = "Nikolai";
        names[1] = "Aleksander";
        names[2] = "Kirill";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
