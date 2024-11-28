
import java.util.Scanner;

public class sueldos {
    public static void main(String[] args) {
        System.out.println("¿cuantos sueldos intentas ingresar?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sueldoMayor = 0;
        double sueldo;
        // inicializacoin ; condicion para que funcione ; incremento/decremento
        for (int x = n; x > 0; x--) {
            System.out.println("Ingresa  el  siguiente sueldo..");
            sueldo = sc.nextDouble();
            if (sueldo > sueldoMayor) {
                sueldoMayor = sueldo;
            }

        }
        System.out.println("el sueldo mas alto es: $" + sueldoMayor);
    }
}
