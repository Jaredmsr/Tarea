import java.util.Scanner;

public class asteriscos {
    public static void main(String a[]) {
        Scanner s = new Scanner(System.in);
        short cantidad = s.nextShort();
        short contador = 1;
        while (contador <= cantidad) {
            short subContador = contador;
            while (subContador > 0) {
                System.out.print("*");
                subContador--;
            }
            System.out.println("");
            contador++;
        }
        contador = (short) (cantidad - 1);

        while (contador > 0) {
            short subContador = contador;

            while (subContador > 0) {
                System.out.print("*");
                subContador--;
            }
            System.out.println("");
            contador--;
        }
        s.close();

        System.out.println(cantidad);
    }
}
// Leer por teclado un numero entero, se debera dibujar una flecha apuntando
// hacia
// la derecha con asteriscos
// donde el numero ingresado sea la cantidad maxima de asteriscos dibujados
/*
 * 5
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 */