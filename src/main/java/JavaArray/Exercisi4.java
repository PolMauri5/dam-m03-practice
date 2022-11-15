package JavaArray;

import java.util.Scanner;

public class Exercisi4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[2];
        int[] arr2 = new int[2];
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("num: " + (i + 1));
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("num: " + (i + 1));
            arr2[i] = scanner.nextInt();
        }

        int c = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[c] = arr1[i];
            c++;
            arr3[c] = arr2[i];
            c++;
        }

        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}

