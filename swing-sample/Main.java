import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sample App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420, 220);
            frame.setLayout(new FlowLayout());

            JButton btnHello = new JButton("Xin chào");
            btnHello.addActionListener(e -> JOptionPane.showMessageDialog(frame, "xin chào"));

            JButton btnBye = new JButton("Tạm biệt");
            btnBye.addActionListener(e -> JOptionPane.showMessageDialog(frame, "tạm biệt"));

            frame.add(btnHello);
            frame.add(btnBye);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
