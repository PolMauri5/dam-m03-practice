package JavaMatrix;

public class Matrix3 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[9][9];
        //transform 5 first 0 into x
        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1[i].length; j++) {
                if (i == j || i == 0 || i == matrix1.length-1) {
                    matrix1[i][j] = 1;
                } else {
                    matrix1[i][j] = 0;
                }
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }


    }
}
