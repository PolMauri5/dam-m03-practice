package JavaMatrix;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] numbers = new int[rows][cols];
        int[] arr = new int[cols];
        int sumaColumna;

        //input
        //row
        for (int i = 0; i < rows; i++) {
            //colum
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        //suma columnes

        for (int i = 0; i < cols; i++) {
            sumaColumna = 0;
            for (int j = 0; j < rows; j++) {
                sumaColumna += numbers[j][i];
            }
        // print suma
            arr[i] = sumaColumna;
            System.out.println((arr[i]) + " ");
            System.out.println();
        }

        //output numeros de la matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }


    }
}
