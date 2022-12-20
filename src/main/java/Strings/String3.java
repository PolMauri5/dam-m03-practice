package Strings;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu la paraula: ");
        String cadena = scanner.nextLine();
        if (cadena.length() < 2){
            System.out.println("cadena buida");
        }else {
            System.out.println(cadena.substring(0,2) + cadena.substring(cadena.length()-2));
        }


    }
}
