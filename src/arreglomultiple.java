
public class arreglomultiple {
    public static String impsinsalto(String texto) {
        System.out.print(texto);
        return texto;
    }

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        int[][] listanum = new int[1201][1201];
        for (int i = 1; i < 101; i++) {
            imprimir(" ");
            for (int e = 1; e < 101; e++) {
                listanum[i][e] = (i * e);
                impsinsalto("[" + listanum[i][e] + "]");
            }
        }
    }
}