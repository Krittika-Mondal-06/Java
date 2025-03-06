import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Example");
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Click Me");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem menuItem = new JMenuItem("Exit");

        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button.addActionListener(e -> textField.setText("Button Clicked!"));
        menuItem.addActionListener(e -> System.exit(0));
    }
}
