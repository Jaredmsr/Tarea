
import java.util.ArrayList;
import java.util.Scanner;

public class arratlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un valor");
        int jamon = sc.nextInt();
        String nombre = "jose";
        Object[] arreglo = new Object[1000];
        arreglo[0] = "perrito";
        arreglo[1] = jamon;
        arreglo[2] = true;
        arreglo[3] = 55;
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);

        System.out.println(arrayList);
        System.out.println(arrayList.contains(55));

    }

}
