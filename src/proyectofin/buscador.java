import java.util.List;
import java.util.Scanner;

public class buscador {
    public String buscar() {
        Scanner scanner = new Scanner(System.in);
        Apiutil producto = new Apiutil();

        System.out.println("****************************************");
        System.out.println("*   Módulo de Búsqueda de Productos    *");
        System.out.println("****************************************");
        System.out.println("1) Buscar por ID");
        System.out.println("2) Buscar por Título (parcial)");
        System.out.println("0) Salir");
        System.out.print("Selecciona una opción: ");

        int opcion2 = scanner.nextInt();
        scanner.nextLine();

        switch (opcion2) {
            case 1:
                System.out.print("Ingrese el ID del producto que desea consultar: ");
                String productId = scanner.nextLine();

                String productData = producto.ProductById(productId);

                if (productData != null) {
                    producto.parseProductData(productData);
                    producto.printProductDetails();
                } else {
                    System.out.println("Error: Producto no encontrado o problema con la API.");
                }

                break;
            case 2:
                System.out.print("Ingrese una parte del título del producto: ");
                String partialTitle = scanner.nextLine();

                List<String> eleciondeProducts = producto.ProductsByTitle(partialTitle);

                if (!eleciondeProducts.isEmpty()) {
                    System.out.println("Producto encontrado o similares:");
                    for (int i = 0; i < eleciondeProducts.size(); i++) {
                        producto.parseProductData(eleciondeProducts.get(i));
                        System.out.println((i + 1) + ") " + producto.title);
                    }

                    System.out.print("Selecciona el número del producto para ver detalles (o 0 para cancelar): ");
                    int seleccion = scanner.nextInt();
                    scanner.nextLine();

                    if (seleccion > 0 && seleccion <= eleciondeProducts.size()) {
                        producto.parseProductData(eleciondeProducts.get(seleccion - 1));
                        producto.printProductDetails();
                    } else {
                        System.out.println("Selección cancelada.");
                    }
                } else {
                    System.out.println("No se encontraron productos con ese título.");
                }
                break;
            case 0:
                System.out.println("Gracias por visitarnos ¡Hasta pronto!");
                return layout.MenuDisplay;
            default:
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                break;
        }
        System.out.println();
        return buscar();
    }
}
