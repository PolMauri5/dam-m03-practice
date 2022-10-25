package com.polmauri;

import java.util.Scanner;

public class Exercisi10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float profit;
        float fluctuation = 0.2f;
        float dailyInversion;
        boolean risingMaket;

        System.out.print("Quants diners has invertit avui: ");
        dailyInversion = scanner.nextFloat();

        System.out.println("Està el mercat en alça(true/false)? ");
        if (risingMaket = scanner.nextBoolean()) {
            profit = (dailyInversion * fluctuation);
                System.out.println("El teu profit és de: " + profit);

        } else {
            fluctuation = fluctuation * (-1);
                profit = (dailyInversion * fluctuation);
                    System.out.println("El teu profit és de: " + profit);
        }
    }
}
