import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Apiutil extends Product {

    public String ProductById(String productId) {
        String apiUrl = "https://api.escuelajs.co/api/v1/products/" + productId;
        return makeHttpRequest(apiUrl);
    }

    // Método para buscar productos por una parte del título
    public List<String> ProductsByTitle(String partialTitle) {
        String apiUrl = "https://api.escuelajs.co/api/v1/products";
        String jsonResponse = makeHttpRequest(apiUrl);
        List<String> matchedProducts = new ArrayList<>();

        if (jsonResponse != null) {
            // Buscar productos cuyo título contenga la cadena parcial
            int currentIndex = 0;
            while ((currentIndex = jsonResponse.indexOf("\"title\":\"", currentIndex)) != -1) {
                int titleStart = currentIndex + 9; // Longitud de "\"title\":\""
                int titleEnd = jsonResponse.indexOf("\"", titleStart);
                String title = jsonResponse.substring(titleStart, titleEnd);

                if (title.toLowerCase().contains(partialTitle.toLowerCase())) {
                    // Extraer el objeto JSON completo del producto
                    int objectStart = jsonResponse.lastIndexOf("{", currentIndex);
                    int objectEnd = jsonResponse.indexOf("}", currentIndex) + 1;
                    matchedProducts.add(jsonResponse.substring(objectStart, objectEnd));
                }
                currentIndex = titleEnd;
            }
        } else {
            System.err.println("Error al conectar con la API.");
        }
        return matchedProducts;
    }

    private String makeHttpRequest(String apiUrl) {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                return response.toString();
            } else {
                System.err.println("Error en la solicitud: Código " + conn.getResponseCode());
            }
        } catch (IOException e) {
            System.err.println("Error al conectar con la API: " + e.getMessage());
        }
        return null;
    }

    public void parseProductData(String jsonData) {
        this.title = extractValue(jsonData, "title");
        this.price = extractValue(jsonData, "price");
        this.description = extractValue(jsonData, "description");
        this.images = extractValue(jsonData, "images");
    }

    private String extractValue(String json, String key) {
        String keyPattern = "\"" + key + "\":";
        int keyIndex = json.indexOf(keyPattern);

        if (keyIndex != -1) {
            int valueStart = keyIndex + keyPattern.length();
            if (key.equals("images")) {
                int arrayStart = json.indexOf("[", valueStart);
                int arrayEnd = json.indexOf("]", arrayStart + 1);
                return json.substring(arrayStart, arrayEnd + 1);
            } else {
                int valueEnd = json.indexOf(",", valueStart);
                if (valueEnd == -1)
                    valueEnd = json.indexOf("}", valueStart);
                return json.substring(valueStart, valueEnd).replace("\"", "").trim();
            }
        }
        return "No disponible";
    }

    public void printProductDetails() {
        System.out.println("Detalles del producto:");
        System.out.println("Título: " + this.title);
        System.out.println("Precio: " + this.price);
        System.out.println("Descripción: " + this.description);
        System.out.println("Imágenes: " + this.images);
        LocalDateTime locaDate = LocalDateTime.now();
        int horas = locaDate.getHour();
        int minutos = locaDate.getMinute();
        int segundos = locaDate.getSecond();
        int mes = locaDate.getMonthValue();
        int year = locaDate.getYear();
        DayOfWeek day = locaDate.getDayOfWeek();

        System.out.println("fecha y hora de consulta fue: " + day + "/" + mes + "/" + year + ". " + horas + ":"
                + minutos + ":" + segundos);
    }
}