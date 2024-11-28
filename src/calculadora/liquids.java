package calculadora;

import java.util.Scanner;

public class liquids {
    Scanner sc = new Scanner(System.in);
    Double mult = sc.nextDouble();

    public Double Onzasaml() {
        Double ml = 29.5735;
        Double Total = mult * ml;
        return Total;
    }

    public Double Onzasalitro() {
        Double litro = 0.0295735;
        Double Total = mult * litro;
        return Total;
    }

    public Double Onzasagalon() {
        Double Galon = 0.00781255;
        Double Total = mult * Galon;
        return Total;
    }
}
