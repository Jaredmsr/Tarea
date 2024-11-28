package calculadora;

import java.util.Scanner;

public class Restado {
    public Double Restado() {
        Double numr1, numr2, totalr;
        Scanner sc = new Scanner(System.in);
        numr2 = sc.nextDouble();
        numr1 = sc.nextDouble();
        totalr = numr2 - numr1;
        return totalr;
    }
}