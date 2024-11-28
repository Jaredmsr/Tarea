package calculadora;

import java.util.Scanner;

public class Division {
    public Double Division() {
        Double numd1, numd2, total;
        Scanner sc = new Scanner(System.in);
        numd2 = sc.nextDouble();
        numd1 = sc.nextDouble();
        total = numd2 / numd1;
        return total;
    }
}