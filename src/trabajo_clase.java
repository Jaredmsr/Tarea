
import java.util.ArrayList;
import java.util.Arrays;

public class trabajo_clase {
    public static void main(String[] args) {
        /*
         * 1)crear un programa que genere un array
         * que contenga los numeros del 1 al 100
         * 2)crear un ArrayList que contenga los numeros del numero 101 al 200.
         * 2)crear un ArrayList que contenga el equivalente
         * a los contenidos tanto al Array(1) como al Array list (2) 1-200
         */
        int[] arreglo = new int[100];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 100; i++)
            arrayList.add(i + 100);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int valor : arreglo) {
            arrayList2.add(valor);
            arrayList2.addAll(arrayList);

        }
        System.out.println(Arrays.toString(arreglo));
        System.out.println(arrayList);
        System.out.println(arrayList2);
    }
}
