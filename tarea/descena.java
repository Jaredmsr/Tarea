
import java.util.Scanner;

public class descena {
    public static void main(String[] args) {
        System.out.println("entregame un numero entero positivo y te dire sus la cantidad de cifras:");
        Scanner sc = new Scanner(System.in);
        int entero = sc.nextInt();
        if (entero <= 0) 
        {System.out.println("introduce un valor valido");}
        else{ 
            int valor = 0;
            while(entero > 0) {
                entero /= 10;
                valor++;
            }
            System.out.println("su cifra es de " + valor);
        }

    }
}
