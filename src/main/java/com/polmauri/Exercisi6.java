package com.polmauri;

import java.util.Scanner;

public class Exercisi6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float liters;
        boolean door = false;

        System.out.print("Quants litres per metre quadrat han plogut: ");
        liters = scanner.nextFloat();

        if (liters > 90f){
            door = true;
        } if (door){
            System.out.println("Les comportes s'han obert i l'aigua del riu s'ha desviat");
        } else {
            System.out.println("Les comportes segueixen tancades ja que ha plogut menys de 90L");
        }


    }
}