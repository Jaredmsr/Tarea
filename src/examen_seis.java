
import java.util.Scanner;

public class examen_seis {
    public static String impsinsalto(String texto) {
        System.out.print(texto);
        return texto;
    }

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        System.out.println("da un numero");
        Scanner sc = new Scanner(System.in);
        int numsi = sc.nextByte();
        if (numsi < 100) {
            imprimir("tu valor es menor al 100");
            if (numsi > 100) {
                imprimir("tu numero es mayor a 100");
            }
        }

    }
}
