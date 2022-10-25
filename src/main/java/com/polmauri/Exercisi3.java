package com.polmauri;

import java.util.Scanner;

public class Exercisi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float preuFigura;
        boolean estatFigura;
        float preuFinal;

        System.out.print("Quan t'ha cosatat la teva figura: ");
        preuFigura = scanner.nextInt();

        System.out.print("Esta en bon estat la figura(s/n): ");
        estatFigura = scanner.nextBoolean();

        if (estatFigura) {
            preuFinal = preuFigura * 1.25f;

        } else {
            preuFinal = preuFigura * 1.10f;
        }
        System.out.println("El preu final de la figura és " + preuFinal);


    }
}
