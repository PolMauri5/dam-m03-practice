package com.polmauri;

import java.util.Scanner;

public class Exercisi4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numNois, numNoies;

        System.out.print("Escriu el numero de noies: ");
        numNoies = scanner.nextInt();

        System.out.print("Escriu el numero de nois: ");
        numNois = scanner.nextInt();

        int total = numNois + numNoies;

        float totalNois = (float) numNois / total * 100;
        float totalNoies = (float) numNoies / total * 100;

        System.out.printf("Hi ha un percentatge de %.2f %% de nois" + "i un % 2f %% de noies", totalNois, totalNoies);


    }
}