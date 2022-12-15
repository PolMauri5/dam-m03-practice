package JavaMatrix;

public class Excel4 {
    public static void main(String[] args) {
        //make a matrix 5x5 and fill it with a column of "a" and a column of "b"
        int[][] matrix1 = new int[5][5];
        int c = 1;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                if (c > 5) {
                    c = 1;
                }
                if (j == 0) {
                    System.out.print(" " + (char) ('a') + " ");
                    c++;
                } else if (j == 1) {
                    System.out.print(" " + (char) ('b') + " ");
                    c++;
                } else if (j == 2) {
                    System.out.print(" " + (char) ('a') + " ");
                    c++;
                } else if (j == 3) {
                    System.out.print(" " + (char) ('b') + " ");
                    c++;
                } else if (j == 4) {
                    System.out.print(" " + (char) ('a') + " ");
                    c++;
                }

            }
            System.out.println();
        }

    }
}
