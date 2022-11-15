package JavaArray;//package JavaArray;
//
//import java.util.Scanner;
//
//public class Exercisi6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr1 = new int[10];
//        int[] arr2 = new int[arr1.length];
//    }
//}
import java.util.Arrays;

class Exercisi6 {
    public static void main(String args[]) {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
