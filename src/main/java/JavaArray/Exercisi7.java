package JavaArray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercisi7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int num;
        int position = -1;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("num: ");
            arr1[i] = scanner.nextInt();
        }
        Arrays.sort(arr1);

        for (int j : arr1) {
            System.out.println(j);
        }

        System.out.println("Escriu el numero: ");
        num = scanner.nextInt();

        boolean found = false;

        for (int i : arr1) {
            if (num == i) {
                position += i;

                System.out.println("value " + num + " in arr " + "on position: " + position);

                found = true;
            }
        }

        if (!found) {
            System.out.println("value not in arr");
        }


    }
}
