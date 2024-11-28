package operacionesdearreglo;

import java.util.Scanner;

public class suma_de_valores {
    public static int sumarValores(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        int[] numeros = new int[5];
        System.out.println("ingresa 5 valores");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println("La suma es: " + sumarValores(numeros));
    }
}
