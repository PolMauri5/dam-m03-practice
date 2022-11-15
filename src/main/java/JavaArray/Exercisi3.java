package JavaArray;

import java.util.Scanner;

public class Exercisi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float mediaPos, mediaNeg, zero = 0, negNum = 0, negNumTotal = 0, posNum = 0, posNumTotal = 0;
        float[] numArr = new float[5];

        for (int i = 0; i < 5 ; i++){
            int num = scanner.nextInt();
            numArr[i] = num;
        }
        for (float num : numArr) {
            if (num > 0) {
                posNum++;
                posNumTotal += num;
        } else if (num < 0) {
            negNum++;
            negNumTotal += num;
        } else {
            zero++;
        }
    }
    mediaPos = posNumTotal / posNum;
    mediaNeg = negNumTotal / negNum;
    System.out.printf("Media positivos: %.2f\nMedia negativos: %.2f\nTotal de ceros: %.0f", mediaPos, mediaNeg, zero);

    }
}
