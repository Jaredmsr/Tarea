
import java.util.Random;
import java.util.Scanner;
//Crear 1 arreglo de 100 elementos, que contenga numeros enteros. Asignarle valores aleatorios de entre 500 y 1000.
//Posteriormente utilizar el ordenamiento burbuja (*Investigar)
//para ordenar los valores del arreglo de menor a mayor.
//Se deberán mostrar los valores contenidos en el arreglo antes y despues del ordenamiento.

public class arregloburbuja_tareav {
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 500;
        int max = 1000;
        Random k = new Random();
        int[] elementos = new int[100];
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = k.nextInt(max - min) + min;
            System.out.print(elementos[i] + " ");
        }
        for (int i = 0; i < elementos.length - 1; i++) {
            for (int j = 0; j < (elementos.length - 1 - i); j++) {
                if (elementos[j] > elementos[j + 1]) {
                    int aux = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = aux;
                }
            }
        }
        imprimir("");
        imprimir("el valor ordenado es: ");
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
        }
        imprimir("");
        imprimir("que arreglo quieres recibir");
        int recibido = sc.nextInt();
        imprimir(" " + elementos[recibido]);
    }
}