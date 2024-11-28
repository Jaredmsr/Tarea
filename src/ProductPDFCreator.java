public class ProductPDFCreator {
    public void guardaPDFDeProducto(Product product) {
        // Nombre del archivo PDF que se generará
        String pdfPath = "documento.pdf";

        try {
            // Creación del documento PDF
            Document document = new Document();

            // Crear el escritor de PDF
            PdfWriter.getInstance(document, new java.io.FileOutputStream(pdfPath));

            // Abrir el documento para agregar contenido
            document.open();

            // Agregar texto al PDF
            document.add(new Phrase("Nombre del Producto: " + product.title + "\n"));
            document.add(new Phrase("Precio del Producto: " + product.price + "\n"));

            // Descargar y agregar imagen desde una URL
            String imageUrl = .images.get(0); // URL de la imagen
            Image image = Image.getInstance(imageUrl);

            // Ajustar el tamaño de la imagen si es necesario
            image.scaleToFit(300, 300); // Ajusta el tamaño máximo (ancho, alto)
            document.add(image); // Agregar imagen al documento

            // Cerrar el documento
            document.close();

            System.out.println("PDF creado con éxito en: " + pdfPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
