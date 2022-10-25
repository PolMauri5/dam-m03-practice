package com.polmauri;

import java.util.Scanner;

//EE = 20%
//POU = 10%
//EF = 40%
//PF = 30%
public class Exercisi11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float EE = -1, POU = -1, EF = -1, PF =-1;
        float finalMark;

        while ((EE < 0 || EE > 10) || (POU < 0 || POU > 10) || (EF < 0 || EF > 10) || (PF < 0 || PF > 10)) {
            System.out.print("Quina ès la teva nota del EE: ");
            EE = scanner.nextFloat();


            System.out.print("Quina ès la teva nota del POU: ");
            POU = scanner.nextFloat();

            System.out.print("Quina ès la teva nota del EF: ");
            EF = scanner.nextFloat();

            System.out.print("Quina ès la teva nota del PF: ");
            PF = scanner.nextFloat();
        }

        finalMark = ((EE * 0.20f) + (POU * 0.10f) + (EF * 0.40f) + (PF * 0.30f));
        System.out.println("La teva penosa nota final amb els porcentatges ès de: " + finalMark);
    }
}
