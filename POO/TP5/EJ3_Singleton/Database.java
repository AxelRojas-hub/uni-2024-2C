package EJ3_Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static Database instancia;
    private Connection conexion;

    private Database() {
        try {
            String url = "jdbc:postgresql://localhost:5432/TP5EJ3";
            String usuario = "postgres";
            String password = "a39436707";
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión a la base de datos establecida");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Database getInstancia() {
        if (instancia == null) {
            instancia = new Database();
        }
        return instancia;
    }

    public void ejecutarConsulta(String query) {
        try (Statement stmt = conexion.createStatement()) {
            stmt.execute(query);
            System.out.println("Ejecutando: " + query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
