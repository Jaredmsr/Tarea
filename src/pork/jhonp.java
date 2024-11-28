package pork;

import modulos.Leer;

public class jhonp {
    public static void main(String[] args) {
        Leer leer = new Leer();
        String texto = leer.Leertexto();
        System.out.println("escribiste " + texto);
        int numero = leer.LeerNumeroEntero();
        System.out.println("el numero es " + numero);
        double numerodouble = leer.LeerNumeroDecimal();
        System.out.println("el numero es " + numerodouble);
    }
}
