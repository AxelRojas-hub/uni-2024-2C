package EJ1;

import javax.swing.*;

public class Ejercicio1A {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 1A");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel label = new JLabel("¿Está seguro que quiere dar de baja al usuario?");
        JButton button = new JButton("Aceptar");
        JButton buttonCancelar = new JButton("Cancelar");
        button.setBounds(85, 130, 100, 30);
        buttonCancelar.setBounds(205, 130, 100, 30);
        label.setBounds(55, 80, 300, 30);

        frame.add(label);
        frame.add(button);
        frame.add(buttonCancelar);
        frame.setVisible(true);
    }
}
