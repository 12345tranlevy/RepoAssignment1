import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sample App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLayout(new FlowLayout());

            JButton btnHello = new JButton("Xin chào");
            btnHello.addActionListener(e -> JOptionPane.showMessageDialog(frame, "xin chào"));

            frame.add(btnHello);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

