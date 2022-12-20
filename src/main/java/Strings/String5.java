package Strings;

import java.lang.reflect.Array;
import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palabras = new String[3];
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Escriba una palabra: ");
            palabras[i] = scanner.nextLine();
        }
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > count) {
                count = palabras[i].length();
                count2 = i;
            }
        }
        System.out.println("La palabra mas larga es: " + palabras[count2]);
        System.out.println("La longitud de la palabra mas larga es: " + count);
    }
}
