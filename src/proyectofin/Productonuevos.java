
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

    // Mostrador de detalles
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

    // Comparar ID por medio de equals y hashcode
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

}