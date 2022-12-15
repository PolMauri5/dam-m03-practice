package JavaMatrix;

public class Matrix4 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[5][5];


        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (i == j || i == matrix1.length -1 - j)  {
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
