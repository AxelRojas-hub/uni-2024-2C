import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Configuración de Conexión");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel labelHost = new JLabel("Host:");
        labelHost.setBounds(50, 20, 100, 30);
        JTextField textFieldHost = new JTextField();
        textFieldHost.setBounds(150, 20, 200, 30);

        JLabel labelPuerto = new JLabel("Puerto:");
        labelPuerto.setBounds(50, 60, 100, 30);
        JTextField textFieldPuerto = new JTextField();
        textFieldPuerto.setBounds(150, 60, 200, 30);

        JLabel labelBase = new JLabel("Base:");
        labelBase.setBounds(50, 100, 100, 30);
        JTextField textFieldBase = new JTextField();
        textFieldBase.setBounds(150, 100, 200, 30);

        JLabel labelUsuario = new JLabel("Usuario:");
        labelUsuario.setBounds(50, 140, 100, 30);
        JTextField textFieldUsuario = new JTextField();
        textFieldUsuario.setBounds(150, 140, 200, 30);

        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setBounds(50, 180, 100, 30);
        JPasswordField textFieldPassword = new JPasswordField();
        textFieldPassword.setBounds(150, 180, 200, 30);

        JButton buttonProbarConexion = new JButton("Probar conexión");
        buttonProbarConexion.setBounds(150, 220, 150, 30);

        buttonProbarConexion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String host = textFieldHost.getText();
                String puerto = textFieldPuerto.getText();
                String base = textFieldBase.getText();
                String usuario = textFieldUsuario.getText();
                String password = new String(textFieldPassword.getPassword());
                String url = "jdbc:postgresql://" + host + ":" + puerto + "/" + base;

                try (Connection connection = DriverManager.getConnection(url, usuario, password)) {
                    JOptionPane.showMessageDialog(frame, "Conexión exitosa a la base de datos");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(frame, "Error al conectar a la base de datos: " + ex.getMessage());
                }
            }
        });

        frame.add(labelHost);
        frame.add(textFieldHost);
        frame.add(labelPuerto);
        frame.add(textFieldPuerto);
        frame.add(labelBase);
        frame.add(textFieldBase);
        frame.add(labelUsuario);
        frame.add(textFieldUsuario);
        frame.add(labelPassword);
        frame.add(textFieldPassword);
        frame.add(buttonProbarConexion);

        frame.setVisible(true);
    }
}