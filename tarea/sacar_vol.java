
import java.util.Scanner;


public class sacar_vol {
    static Float volumen (Float radio) { return (float) ((4.0/3.0)*Math.PI*Math.pow(radio, 3));
    }
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("dame el valor del radio de tu esfera:");
        Float radio = sc.nextFloat();
        System.out.println("el volumen de tu  esfera es de "+ volumen(radio));
}
}
