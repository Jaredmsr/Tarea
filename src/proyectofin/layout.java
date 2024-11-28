
import java.util.Scanner;

public class layout {

    public class MenuDisplay {
        static void imprime(String texto) {
            System.out.println(texto);
        }

        public static void main(String[] args) {
            imprime("**************************************************");
            imprime("*                                                *");
            imprime("*   Bienvenido al Catálogo de Productos.         *");
            imprime("*                                                *");
            imprime("*   Selecciona una de las siguientes opciones:   *");
            imprime("*                                                *");
            imprime("*   1) Buscar Productos                          *");
            imprime("*   2) Agregar Producto (tentativo)             *");
            imprime("*   3) Eliminar Producto                         *");
            imprime("*   0) Salir                                     *");
            imprime("*                                                *");
            imprime("**************************************************");
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    buscador si = new buscador();
                    System.out.println(" " + si.buscar());
                    break;
                case 2:
                    agproduct op2 = new agproduct();
                    System.out.println(" " + op2.agregado());
                    break;
                case 3:

                    break;
                case 0:
                    System.out.println("Gracias por visitarnos.");
                    break;
                case 4:
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static final String MenuDisplay = " ";

}
