
import java.util.Scanner;

public class cubos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("da el valor de lado del  cubo:");
        int ladocubo = sc.nextInt();
        System.out.println(ladocubo * ladocubo * ladocubo);
    }
}
