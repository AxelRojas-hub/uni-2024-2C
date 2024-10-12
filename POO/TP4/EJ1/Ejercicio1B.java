package EJ1;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class Ejercicio1B {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 1A");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel label = new JLabel("¿Está seguro que quiere dar de baja al usuario?");
        JTextField input = new JTextField();
        JButton button = new JButton("Aceptar");
        label.setBounds(55, 80, 300, 30);
        input.setBounds(90, 120, 200, 30);
        button.setBounds(135, 160, 100, 30);

        frame.add(label);
        frame.add(button);
        frame.add(input);
        frame.setVisible(true);
    }
}
