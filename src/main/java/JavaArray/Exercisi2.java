package JavaArray;

import java.util.Scanner;

public class Exercisi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] numero = new float[5];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Escriu 5 numeros: " + (i+1));
            numero[i] = scanner.nextFloat();
        }
        for (int i = numero.length-1; i > -1; i--) {
            System.out.print(numero[i] +  ", ");
        }

    }
}
