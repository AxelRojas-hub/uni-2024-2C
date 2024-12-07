package EJ3_Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static Database instancia;
    private Connection conexion;

    @SuppressWarnings({"CallToPrintStackTrace", "UseSpecificCatch"})
    private Database() {
        try {
            String url = "jdbc:postgresql://localhost:5432/TP5EJ3";
            String usuario = "postgres";
            String password = System.getenv("DB_PASSWORD");
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion a la base de datos establecida");
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

    @SuppressWarnings("CallToPrintStackTrace")
    public ResultSet ejecutarConsulta(String query) {
        ResultSet resultSet = null;
        try{
            Statement stmt = conexion.createStatement();
            resultSet = stmt.executeQuery(query);
            System.out.println("Ejecutando: " + query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
