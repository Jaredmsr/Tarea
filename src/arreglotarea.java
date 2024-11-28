public class arreglotarea {
    public static void main(String[] args) {
        int[] valores = new int[100];
        final int constante = 1000;
        for (int x = 0; x < valores.length; x++) {
            valores[x] = x + constante;
        }
        for (int x = 99; x >= 0; x--) {
            valores[x] = x + constante;
            System.out.println(valores[x]);
        }
    }
}
