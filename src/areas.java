import java.util.Scanner;

public class areas {
    static void imprime(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        Double numero1;
        double numero2;
        imprime("elige la figura para sacar area:");
        imprime("1.-triangulo");
        imprime("2.-circulo");
        imprime("3.-rectangulo");
        imprime("4.-cuadrado");
        imprime("5.-salir");
        Scanner sc = new Scanner(System.in);
        int figura = sc.nextInt();
        switch (figura) {
        case 1:
            imprime("dame la altura:");
            numero1 = sc.nextDouble();
            imprime("dame la base:");
            numero2 = sc.nextDouble();
            imprime("El area del triangulo es: " + (numero1 * numero2 / 2));

        case 2:
            imprime("dame el radio:");
            numero1 = sc.nextDouble();
            imprime("El area del circulo es: " + (Math.PI * numero1));

        case 3:

        case 4:

        case 5:

            break;
        default:
            throw new AssertionError();
        }

    }
}
