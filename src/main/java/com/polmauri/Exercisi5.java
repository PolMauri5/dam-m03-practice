package com.polmauri;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercisi5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int preuGandCalifornia = 73490;
        int fullEquip = 20000;
        int versio;
        int quilometres;

        System.out.print("Quants quilometres has fet amb el teu cotxe: ");
        quilometres = scanner.nextInt();

        System.out.print("Si tens la versio pobre apreta 1 si no 2: ");
        versio = scanner.nextInt();

        if (versio == 2) {
            preuGandCalifornia = (preuGandCalifornia + fullEquip);
        }

        while (versio != 1 && versio != 2) {
            System.out.print("Si tens la versio pobre apreta 1 si no 2: ");
            versio = scanner.nextInt();
        }

        float preuPerdut = (preuGandCalifornia * quilometres * 0.00001f);
        float preuFinal = (preuGandCalifornia - preuPerdut);

        System.out.println("El preu final és de " + preuFinal);

    }
}