
import java.util.Scanner;

public class conversionCyF {
    public static float convertircelsiusafahrenheit(float grados) {
        return 32 + (9 * grados) / 5;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un valor en celsious y lo convertiremos a fahrenheit");
        float grados = sc.nextFloat();
        System.out.println("el valor es de " + convertircelsiusafahrenheit(grados) + "° fahrenheit");

    }

}
