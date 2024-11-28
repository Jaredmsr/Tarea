package calculadora;

import java.util.Scanner;

public class Multiplicacion {
    public Double Multiplicacion() {
        Double numm1, numm2, total;
        Scanner sc = new Scanner(System.in);
        numm2 = sc.nextDouble();
        numm1 = sc.nextDouble();
        total = numm2 * numm1;
        return total;
    }
}