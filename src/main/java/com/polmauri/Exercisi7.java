package com.polmauri;

import java.util.Scanner;

public class Exercisi7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baseSalary = 1250;
        boolean covid;
        int risk = 250;
        int horesExtres = 0;
        int horesExtra1 = 15;
        int horesExtra2 = 12;

        System.out.print("Tens covid (T/F): ");
        covid = scanner.nextBoolean();

        System.out.print("Quantes hores extres has fet? ");
        horesExtres = scanner.nextInt();


        if (covid){
            baseSalary = baseSalary + risk;
            horesExtra1 = horesExtra1 + 5;
            horesExtra2 = horesExtra2 + 5;
        } if (horesExtres < 5){
            baseSalary = baseSalary + horesExtres * horesExtra1;
            System.out.println("El teu salari final ès de " + baseSalary);
        } else {
            horesExtres = (horesExtres - 5);
            baseSalary = baseSalary + (5 * horesExtra1) + (horesExtres * horesExtra2);
            System.out.println("El teu salari final ès de " + baseSalary);
        }
    }
}
