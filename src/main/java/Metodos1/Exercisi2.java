package Metodos1;

import java.util.Scanner;

public class Exercisi2 {
    public static void main(String[] args) {
        float preu = calculCostProducte();
        calculPreuVenta(preu);
    }

    public static float calculCostProducte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("preu: ");
        float preu = scanner.nextFloat();
        return preu;
    }

    

    public static void calculPreuVenta(float preu) {
        float preuFinal = preu * 1.21f;
        System.out.println("preu de venta: " + preuFinal);
    }
}
