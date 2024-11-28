
import java.util.Arrays;

public class construc {
    public static void impsinsalto(String texto) {
        System.out.print(texto);
    }

    public static void main(String[] args) {
        persona p1 = new persona();
        p1.nombre = "ximena";
        p1.edad = 18;

        persona p2 = new persona();
        p2.nombre = "jared";
        p2.edad = 17;
        persona[] personas = { p1, p2 };
        System.out.println(Arrays.toString(personas));
    }
}
