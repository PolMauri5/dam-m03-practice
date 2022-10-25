package com.polmauri;

import java.util.Scanner;

public class Exercisi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean vip;
        int compra;

        System.out.print("Ets vip (s/n): ");
        vip = scanner.nextBoolean();

        System.out.print("Quan costa le teva compra: ");
        compra = scanner.nextInt();

        if (vip || compra > 200) {
            float preuFinal = (compra - (compra * 0.20f));

            System.out.println("El preu final és " + preuFinal);
        } else {
            System.out.println("El preu final és " + compra);
        }


    }

}

