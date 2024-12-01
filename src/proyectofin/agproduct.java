
import java.util.Scanner;

public class agproduct {

    public String agregado() {
        Scanner sc = new Scanner(System.in);
        Verificador producto = new Verificador();
        System.out.print("Ingrese el ID del producto: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el título del producto: ");
        String title = sc.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese la descripción del producto: ");
        String description = sc.nextLine();

        System.out.print("Ingrese las URLs de las imágenes separadas por comas: ");
        String[] images = sc.nextLine().split(",");

        // Crear el producto
        Productonuevos nuevoProducto = new Productonuevos(id, title, price, description, images);

        boolean success = producto.addProduct(nuevoProducto);

        if (success) {
            System.out.println("El producto fue agregado exitosamente.");
        } else {
            System.out.println("Error al intentar agregar el producto.");
        }
        System.out.println("enviando al buscador...");
        layout po = new layout();
        return po.MenuDisplay;
    }
}
