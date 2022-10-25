package com.polmauri;

import java.util.Scanner;

public class Exercisi13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int producte = 5;
        String producteString = "";
        float moneda = 0.1f;
        float cambio;

        while (producte > 4) {
            System.out.print("Quin producte vols? ");
            producte = scanner.nextInt();
        }

        switch (producte) {
            case 1:
                producteString = "Cafè";
                break;
            case 2:
                producteString = "Cafè Tallat";
                break;
            case 3:
                producteString = "Cafè amb llet";
                break;
            case 4:
                producteString = "Salir";
                System.exit(0);
                break;
        }

        System.out.println(producteString);

        while (moneda < 0.50) {
            System.out.print("Introdueix una moneda: ");
            moneda = scanner.nextFloat();
        }
        System.out.println(moneda);

        if (moneda == 0.50f) {
            System.out.println("Felicitats, aqui tenes el teu: " + producteString);
        } else if (moneda > 0.50f) {
            cambio = moneda - 0.50f;
            System.out.println("Felicitats, aqui tenes el teu " + producteString + " El teu canvi ès de: " + cambio);
        }
    }
}
