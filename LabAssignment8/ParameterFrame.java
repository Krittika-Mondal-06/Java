import javax.swing.*;
import java.awt.*;

public class ParameterFrame extends JFrame {
    private String message;

    public ParameterFrame(String message) {
        this.message = (message != null) ? message : "No parameter passed!";
        setTitle("Parameter Frame");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(message, 50, 100);
    }

    public static void main(String[] args) {
        String paramMessage = (args.length > 0) ? args[0] : null;
        SwingUtilities.invokeLater(() -> {
            ParameterFrame frame = new ParameterFrame(paramMessage);
            frame.setVisible(true);
        });
    }
}