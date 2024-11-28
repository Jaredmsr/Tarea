public class sumas {
    public static int sumar(int suma1, int suma2) {
        return suma1 + suma2;
    }

    public static int sumar(int suma1, int suma2, int suma3) {
        return suma1 + suma2 + suma3;
    }

    public static int sumar(int suma1, int suma2, int suma3, int suma4) {
        return suma1 + suma2 + suma3 + suma4;
    }

    public static void main(String[] args) {

        System.out.println(sumar(0, 0));
        System.out.println(sumar(0, 0, 0, 0));
    }
}
