package calculadora;

import java.util.Scanner;

public class Suma {
    public Double Suma() {
        Double num1, num2, total;
        Scanner sc = new Scanner(System.in);
        num2 = sc.nextDouble();
        num1 = sc.nextDouble();
        total = num2 + num1;
        return total;
    }

}
