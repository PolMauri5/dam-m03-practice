package com.polmauri;

import java.util.Scanner;

public class Exercisi8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pricePerNight = 20;
        int nits;
        int food;
        float hores;
        int preuFinal;

        System.out.print("Quantes nits has estat al hostal? ");
        nits = scanner.nextInt();

        System.out.print("Quants dies vols demanar menjar: ");
        food = scanner.nextInt();

        while (food > nits){
            System.out.println("No crec que pugis demanar mes menjar que dies.");
            System.out.print("Quants dies vols demanar menjar: ");
            food = scanner.nextInt();
        }

        System.out.println("A quina hora vols deixar la teva habitacio? ");
        hores = scanner.nextFloat();

        preuFinal = (nits * pricePerNight) + (food * 20);

        if (hores > 12.00) {
            preuFinal = preuFinal + 15;
        }

        System.out.println("El que has de pagar és: " + preuFinal);



    }
}
