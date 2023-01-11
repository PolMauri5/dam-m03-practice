package Metodos1;

import java.util.Scanner;

public class Exercisi1 {
    public static void main(String[] args) {
        String name = scannerName();
        salutacio(name);
    }

    public static String scannerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom: ");
        String name = scanner.nextLine();
        return name;
    }
    public static void salutacio(String name) { //ha de estar el string ja que sino no saps que es, farem void ja que no retorna res
        System.out.println("Hola " + name);
    }
}

