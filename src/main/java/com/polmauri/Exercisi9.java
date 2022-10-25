package com.polmauri;

import java.util.Scanner;

public class Exercisi9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int venta1, venta2, venta3;
        int preuBase;
        double souFinal;

        System.out.print("Quin és el teu preu base: ");
        preuBase = scanner.nextInt();

        System.out.print("Quin es el preu de la primera venta: ");
        venta1 = scanner.nextInt();

        System.out.print("Quin es el preu de la segona venta: ");
        venta2 = scanner.nextInt();

        System.out.print("Quin es el preu de la tercera venta: ");
        venta3 = scanner.nextInt();

        souFinal = ((venta1 * 0.10) + (venta2 * 0.10) + (venta3 * 0.10) + preuBase);

        System.out.println("El teu sou final és de: " + souFinal);


    }
}
