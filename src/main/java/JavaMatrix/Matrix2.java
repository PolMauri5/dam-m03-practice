package JavaMatrix;

import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int rows = scanner.nextInt();
        System.out.println("input n of cols: \n");
        int cols = scanner.nextInt();

        int[][] numbers = new int[3][cols];
        int[][] matrix2 = new int[3][cols];
        int sumaColumna;
        int valorPequenyo = 0;
        int valorGrande = 0;

        //input
        //row
        for (int i = 0; i < 3; i++) {
            //colum
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        //output numeros de la matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        //print smallest  and biggest numer of every column

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0){
                    valorPequenyo = numbers[j][i];
                    valorGrande = numbers[j][i];
                }else {
                    if (numbers[j][i] < valorPequenyo){
                        valorPequenyo = numbers[j][i];
                    }
                    if (numbers[j][i] > valorGrande){
                        valorGrande = numbers[j][i];
                    }
                }
            }
            System.out.println("valorPequenyo: " + valorPequenyo);
            System.out.println("valorGrande: " + valorGrande);
        }



    }

}




