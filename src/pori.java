public class pori {
    public static void main(String[] args) {
        int arreglo[] = new int[3];
        int sok = 0;
        for (int y = 0; y < 3; y++) {
            arreglo[y] = y + 2;
            int suma = arreglo[0] + arreglo[1] + arreglo[2];
            System.out.println(suma);
        }
    }
}
