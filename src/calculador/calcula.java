package calculador;

import calculadora.Division;
import calculadora.Multiplicacion;
import calculadora.Restado;
import calculadora.Suma;
import calculadora.liquids;
import java.util.Scanner;

public interface calcula {

    static void imprime(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {

        imprime("¿que  operacion deseas hacer?(introduce el numero del inciso a elegir)");
        imprime("1.-suma");
        imprime("2.-resta");
        imprime("3.-multiplicacion");
        imprime("4.-division");
        imprime("5.-conversion Onzas");
        Scanner sc = new Scanner(System.in);
        int operacion = sc.nextInt();
        switch (operacion) {
            case 1:
                imprime("pon los valores a sumar");
                Suma suma = new Suma();
                imprime("tu resultado es " + suma.Suma());
                break;
            case 2:
                imprime("pon los valores a restar");
                Restado rest = new Restado();
                imprime("tu resultado es " + rest.Restado());
                break;
            case 3:
                imprime("pon los valores a multiplicar");
                Multiplicacion Mult = new Multiplicacion();
                imprime("tu resultado es " + Mult.Multiplicacion());
                break;
            case 4:
                imprime("pon los valores a dividir");
                Division divs = new Division();
                imprime("tu resultado es " + divs.Division());
                break;
            case 5:
                imprime("a que medidas deseas convertir:(introduce el numero a elegir)");
                imprime("1.- conversion a mililitros.");
                imprime("2.- conversion a litros");
                imprime("3.-conversion a galones");
                int conversion = sc.nextInt();
                switch (conversion) {

                    case 1:
                        imprime("escribe las onzas a convertir");
                        liquids ld = new liquids();
                        imprime("los mililitros son: " + ld.Onzasaml() + "ml");
                        break;
                    case 2:
                        imprime("escribe las onzas a convertir");
                        liquids zd = new liquids();
                        imprime("los litros son: " + zd.Onzasalitro() + "L");
                        break;
                    case 3:
                        imprime("escribe las onzas a convertir");
                        liquids yd = new liquids();
                        imprime("los galones son" + yd.Onzasagalon() + "gal");
                        break;
                    default:
                        throw new AssertionError();
                }
            case 6:

                break;
            default:
                throw new AssertionError();
        }
    }
}
