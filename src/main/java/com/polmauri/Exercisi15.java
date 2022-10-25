package com.polmauri;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercisi15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1, num2, num3;

        System.out.print("Tria tres numeros: \n");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        num3 = scanner.nextFloat();

        List<Float> numbers = new ArrayList<>(List.of(num1, num2, num3));

        numbers.sort(Comparator.naturalOrder());

        for (Float number : numbers) {
            System.out.println(number);
        }
    }
}
