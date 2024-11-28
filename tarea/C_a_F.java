import java.util.Scanner;

public class C_a_F { public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("danos un valor en celsius y lo convertiremos a fahrenheit");
    Float celsious = sc.nextFloat();
    Float formula = 32 + ( 9 * celsious / 5);
    System.out.println("el valor es de " + formula + "° fahrenheit.");
}
    
}
