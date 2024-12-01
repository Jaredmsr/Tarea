
import java.util.ArrayList;
import java.util.List;

public class Verificador {
    private List<Productonuevos> productList;

    public Verificador() {
        this.productList = new ArrayList<>();
    }

    // agrega un producto si no existe
    public boolean addProduct(Productonuevos product) {
        if (!productList.contains(product)) {
            productList.add(product);
            System.out.println("Producto agregado exitosamente:");
            product.printProductDetails();
            return true;
        } else {
            System.out.println("El producto con ID " + product.getId() + " ya existe en la lista.");
            return false;
        }
    }

    // muestra todos los productos en la lista
    public void displayAllProducts() {
        if (productList.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            System.out.println("Lista de productos:");
            for (Productonuevos product : productList) {
                product.printProductDetails();
            }
        }
    }
}
