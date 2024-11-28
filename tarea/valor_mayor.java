
import java.util.Scanner;

public class valor_mayor {
   // El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres.
public static void main(String[] args) {
    System.out.println("entregame el 1er valor");
    Scanner sc= new Scanner(System.in);
    int valor1 = sc.nextInt();
    System.out.println("entregame el 2do valor");
    int valor2 = sc.nextInt();
    System.out.println("entregame el 3er valor");
    int valor3 = sc.nextInt();
    int cont=0;
    if (valor1==valor2){if(valor2==valor3) System.out.println("Todos son iguales");} else{
    if (valor1 > valor2) { if (valor1 > valor3) { System.out.println("el numero mayor es " + valor1);} else  {System.out.println("el numero mayor  es " + valor3);}
    } else {if (valor2 > valor3){ System.out.println("el numero mayor es " + valor2);} else{System.out.println("el numero mayor es " + valor3);}
} 
}
}
}
