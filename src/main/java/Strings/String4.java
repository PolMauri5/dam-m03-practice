package Strings;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu la paraula: ");
        String cadena = scanner.nextLine();
        if (cadena.length() < 3){
            System.out.println(cadena);
        }else if (cadena.substring(cadena.length()-3).equals("ing")){
            System.out.println(cadena + "ly");
        }else {
            System.out.println(cadena + "ing");

        }
    }
}
