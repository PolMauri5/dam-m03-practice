package com.polmauri;

import java.util.Scanner;

public class Exercisi14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float kmTotal = 171.0f;
        float kmKilian = 82.5f;
        float kmPau = 78.2f;
        float velKilian;
        float velPau;
        float tempsKilian;
        float tempsPau;

        System.out.print("A quina velocitat va el Kilian? ");
        velKilian = scanner.nextFloat();

        System.out.print("A quina velocitat va el Pau? ");
        velPau = scanner.nextFloat();

        tempsKilian = (kmTotal - kmKilian) / velKilian;

        tempsPau = (kmTotal - kmPau) / velPau;

        if (tempsKilian < tempsPau){
            System.out.println("EL kilian guanya");
        } else {
            System.out.println("El Pau guaña");
        }

    }
}
