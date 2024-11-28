import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class img {
    public static void main(String[] args) {
        try {

            // URL de la imagen del producto
            String imageUrl = "po";

            // Descargar la imagen
            URL url = new URL(imageUrl);
            BufferedImage image = ImageIO.read(url);

            // Guardar la imagen localmente
            File outputFile = new File("product_image.jpg");
            ImageIO.write(image, "jpg", outputFile);
            System.out.println("Imagen descargada: " + outputFile.getAbsolutePath());

            // Mostrar la imagen en una ventana gráfica
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(640, 480);
            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label);
            frame.setVisible(true);

        } catch (IOException e) {
            System.err.println("Error al descargar o mostrar la imagen: " + e.getMessage());
        }
    }
}
