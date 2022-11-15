package JavaArray;

import java.util.Objects;
import java.util.Scanner;

public class Exercisi5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[10];
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Valor: ");
            arr1[i] = scanner.nextInt();
        }


        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length-1){
                arr2[arr2.length-1] = arr1[0];
            }else {
                arr2[i] = arr1[i + 1];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }

    }
}
