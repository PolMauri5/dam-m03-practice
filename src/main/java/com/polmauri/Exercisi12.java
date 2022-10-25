package com.polmauri;

import java.util.Scanner;

public class Exercisi12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TAX = 6;
        int litres = -1;
        float finalPrize;

        while (litres < 0) {
            System.out.print("Quants litres d'aigua gastes: ");
            litres = scanner.nextInt();
        }

        if (litres < 50) {
            finalPrize = TAX;
        } else if (litres <= 200) {
            finalPrize = litres * 0.15f + TAX;
        } else {
            finalPrize = litres * 0.30f + TAX;
        }
        System.out.println("Al final de mes has de pagar: " + finalPrize);

    }
}
