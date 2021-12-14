import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A panel maintaining a picture of a Do Not Enter sign.
 */
public class DoNotEnterSign extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;

    /**
     * Called by the runtime system whenever the panel needs painting.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int[] xcoords = {200, 350, 230, 100, 50};
        int[] ycoords = {20, 150, 180, 180, 150};

        g.setColor(Color.BLUE);
        g.fillPolygon(xcoords, ycoords, 5);
    }

    /**
     * A little driver in case you want a stand-alone application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var panel = new DoNotEnterSign();
            panel.setBackground(Color.GREEN.darker());
            var frame = new JFrame("A simple graphics program");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}