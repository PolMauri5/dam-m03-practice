package JavaArray;

import java.util.Scanner;

public class Exercisi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] numero = new float[5];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce el numero " + (i+1));
            numero[i] = scanner.nextFloat();
        } for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + ", ");
        }
    }
}
