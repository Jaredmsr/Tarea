import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Imagenes extends JFrame {
    private JPanel pImagen;
    private Icon img;
    private JLabel lblImagen;

    public Imagenes() {

        this.setTitle("Imagenes en JAVA");
        this.setSize(500, 500);
        this.setLocation(100, 30);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imagen();

    }

    public void imagen() {
        this.setLayout(null);
        img = new ImageIcon(getClass().getResource("imagenes/touhou500x500.jpg"));
        add(pImagen = new JPanel());
        add(lblImagen = new JLabel(img));
        lblImagen.setBounds(0, 0, 500, 500);
        pImagen.add(lblImagen);
        pImagen.setBounds(0, 0, 600, 700);

    }
}