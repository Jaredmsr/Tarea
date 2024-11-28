package modulos;

import java.util.Scanner;

public class Leer {
    Scanner sc;

    // contructo (inicializar todo el objeto)
    public Leer() {
        sc = new Scanner(System.in);
    }

    public String Leertexto() {
        return sc.nextLine();
    }

    public int LeerNumeroEntero() {
        return sc.nextInt();
    }

    public double LeerNumeroDecimal() {
        return sc.nextDouble();
    }
}