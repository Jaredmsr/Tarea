import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Eliminador {
    public String eliminarProducto() {
        System.out.print("Ingresa el ID del producto a eliminar: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();

        try {
            String apiUrl = "https://fakestoreapi.com/products/" + id;
            HttpURLConnection conexion = (HttpURLConnection) new URL(apiUrl).openConnection();
            conexion.setRequestMethod("DELETE");

            int conexionRespuesta = conexion.getResponseCode();
            if (conexionRespuesta == HttpURLConnection.HTTP_OK) {
                System.out.println("El producto con ID " + id + " ha sido eliminado correctamente.");
            } else {
                System.out.println("Error al eliminar el producto. Código: " + conexionRespuesta);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        Apiutil producto = new Apiutil();
        String productData = producto.BusquedaporID(Integer.toString(id));

        if (productData != null) {
            System.out.println("eliminando y solicitando producto para su confirmacion");
            producto.anilizadordedata(productData);
            producto.detallesdeproducto();

            return layout.MenuDisplay;
        }
        return productData;
    }

}
