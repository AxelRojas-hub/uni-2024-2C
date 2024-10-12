package EJ2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        JLabel label = new JLabel("Ingresa tu texto");
        label.setBounds(70, 75, 150, 30);

        JTextField input = new JTextField();
        input.setBounds(70, 100, 150, 30);

        java.awt.event.ActionListener action = new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println(input.getText());
            }
        };
        JButton button = new JButton("Submit");
        button.setBounds(70, 135, 150, 30);
        button.addActionListener(action);

        frame.add(label);
        frame.add(input);
        frame.add(button);
        frame.setVisible(true);
    }
}
