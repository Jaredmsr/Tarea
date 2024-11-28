public class arregloburbujault {
    public static void main(String[] args) {

        int[] elementos = { 12, 3, 65, 87, 124, 65, 234, 56, 77 };
        for (int i = 0; i < elementos.length - 1; i++) {
            for (int j = 0; j < (elementos.length - 1 - i); j++) {
                if (elementos[j] > elementos[j + 1]) {
                    int aux = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = aux;
                }

            }

        }
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
        }
    }
}