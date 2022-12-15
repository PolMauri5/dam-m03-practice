package JavaMatrix;

public class Excel3 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[5][5];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (i == j) {
                    System.out.print((boolean) true + " ");
                } else {
                    System.out.print((boolean) false + " ");
                }


            }
            System.out.println();
        }
    }
}
