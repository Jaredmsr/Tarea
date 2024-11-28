import java.util.Scanner;

public class meses {
    public static void main(String[] args) throws Exception {
        // soloicitar por teclado un nuemro del 1-12 se debera mostrar
        // por pnatalla el nombre del mes asociado. eje. 3=> Marzo.
        Scanner sc = new Scanner(System.in);
        byte mes;
        do {
            System.out.println("Escribe un numero entre 1 y 12");
            mes = sc.nextByte();
            // || = or

        } while (mes < 1 || mes > 12);
        switch (mes) {
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            // break es como romper el bucle

            default:
                System.out.println("este no es un mes valido");
                break;
            // este break no es necesario porque no tiene nada despues asi que no hay
            // necesidad

        }

        System.out.println("FIN!!!!");
        sc.close();
    }
}
