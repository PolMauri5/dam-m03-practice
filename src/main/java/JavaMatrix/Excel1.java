package JavaMatrix;

public class Excel1 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[5][5];
        int c = 1;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                if (c > 5) {
                    c = 1;
                }
                    System.out.print(" " + c + " ");
                    c++;

            }
            System.out.println();
        }
    }
}
