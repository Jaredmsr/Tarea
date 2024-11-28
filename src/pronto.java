
public class pronto {
    public static void main(String[] args) {
        // Crear un arreglo de objetos
        // tipos de datos y posteriormente
        // imp el tipo de formato original.
        Object[] valores = { 12.5, false, "jamon", 10, 6f, };
        // por cada Elemento contenido en el arreglo
        for (Object object : valores) {
            System.out.println(object);
            System.out.println(object.getClass().getSimpleName());
        }
    }
}
