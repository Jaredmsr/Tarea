package calculadora;

import java.util.Scanner;

public class liquidos implements IConversion {
    Scanner sc = new Scanner(System.in);
    Double m = sc.nextDouble();

    @Override
    public double convertirOnzasAMililitros(double m) {
        Double Onza = 0.0295735;
        Double Total = m * Onza;
        System.out.println(Total);
        throw new UnsupportedOperationException("Unimplemented method 'convertirOnzasAMililitros'");

    }

    @Override
    public double convertirOnzasAlitros(double m) {
        Double Onza = 0.0295735;
        Double Total = m * Onza;
        System.out.println(Total);
        throw new UnsupportedOperationException("Unimplemented method 'convertirOnzasaGalon'");
    }

    @Override
    public double convertirOnzasaGalon(double m) {
        Double Onza = 0.0078125;
        Double Total = m * Onza;
        System.out.println(Total);
        throw new UnsupportedOperationException("Unimplemented method 'convertirOnzasaGalon'");
    }

}
