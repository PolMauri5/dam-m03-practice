package Strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu la paraula: ");
        String cadena = scanner.nextLine();

        System.out.println(cadena.length());
    }
}
