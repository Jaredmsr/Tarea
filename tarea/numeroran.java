import java. util. Random;
import java.util.Scanner;

public class numeroran{
    public static void main(String[] args){
         // Dentro del método main:
        Random random = new Random();
        int numero_dado;
        Scanner scn = new Scanner(System.in);
        int numeroAleatorio = random. nextInt(100);
        do{ System.out.println("adivina el numero del 1-100, porfavor,ingresa tu numero:");
    numero_dado = scn.nextInt();
    if (numero_dado < numeroAleatorio){
    System.out.println("su numero es menor");
    }else if (numero_dado > numeroAleatorio){
System.out.println("su numero  es  mayor");
}

}while (numeroAleatorio != numero_dado);{
System.out.println("felicidades encontraste el numero");}
}
}
