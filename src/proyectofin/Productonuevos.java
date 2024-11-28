import java.util.ArrayList;
import java.util.List;

public class Productonuevos {
    private int id;
    private String title;
    private double price;
    private String description;
    private String[] images;

    // Constructor
    public Productonuevos(int id, String title, double price, String description, String[] images) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.images = images;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String[] getImages() {
        return images;
    }

    // Método para mostrar los detalles del producto
    public void printProductDetails() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + title);
        System.out.println("Precio: $" + price);
        System.out.println("Descripción: " + description);
        System.out.print("Imágenes: ");
        for (String image : images) {
            System.out.print(image + " ");
        }
        System.out.println("\n");
    }

    // Sobrescribir equals y hashCode para comparar productos por ID
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product product = (Product) obj;
        return id == product.id;
    }

    public int hashCode() {
        return Integer.hashCode(id);
    }

    public class verificador {
        private List<Productonuevos> productList;

        public verificador() {
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
}
