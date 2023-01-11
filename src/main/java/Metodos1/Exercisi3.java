package Metodos1;

import java.util.Scanner;

public class Exercisi3 {
    public static void main(String[] args) {
        int num = controlErrors();
        System.out.println(numeroParell(num));
    }
    public static int controlErrors() {
        Scanner scanner = new Scanner(System.in);
        boolean entero = false;
        int num = 0;

        do {
            System.out.println("Dame un numero: ");
            entero = scanner.hasNextInt();

            if (entero) {
                num = scanner.nextInt();
            } else {
                System.out.println("No has introducido un numero");
                scanner.next();
            }

        } while (!entero);
        return num;
    }
    public static boolean numeroParell(int entero) {
        if (entero % 2 == 0) {
            return true;
        }
        return false;

    }
}
