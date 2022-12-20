package Strings;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu la paraula: ");
        String cadena = scanner.nextLine();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(i) == cadena.charAt(j)){
                    contador++;
                }
            }
            System.out.println(cadena.charAt(i) + ": " + contador);
            contador = 0;
        }
        }
    }

