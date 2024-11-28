
import java.util.ArrayList;
import java.util.Scanner;

public class arraynumint {
    /*
     * Crear un programa que pida numeros enteros por teclado, hasta
     * que se ingrese un numero negativo. Cada numero ingresado
     * debera ser almacenado en un ArrayList. Se limitara a que
     * no contenga numeros duplicados.
     * Terminado el programa, se debera mostrar la suma de todos
     * los numeros.
     */
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        String p = "ingrese los valores enteros que desees y termine con un valor negativo";
        Scanner sc = new Scanner(System.in);
        System.out.println(p);
        int valor = sc.nextInt();
        ArrayList arrayList = new ArrayList<>();
        while (valor >= 0) {
            imprimir(p);

            valor = sc.nextInt();
        }
        if (valor < 0) {
            System.out.println(valor);
        }
        // por cada valor entero contenido en array list
    }
}