package JavaMatrix;

public class Excel5 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[5][5];
        int c = 25;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(" " + c + " ");
                c--;

            }
            System.out.println();
        }
    }
}

