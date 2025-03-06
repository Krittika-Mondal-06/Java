import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("My JFrame Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello, this is an Applet!", 150, 150);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyFrame frame = new MyFrame();
            frame.setVisible(true);
        });
    }
}
