package EJ3_Singleton;

import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {
        Database bd1 = Database.getInstancia();
        ResultSet rs = bd1.ejecutarConsulta("SELECT * FROM alumno WHERE legajo = 1001");

        try {
            while(rs.next()) {
                System.out.println("Legajo: " + rs.getInt("legajo"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Direccion: " + rs.getString("direccion"));
                System.out.println("Edad: "+ rs.getInt("edad"));
                System.out.println("Condicion: "+ rs.getString("condicion"));
            }
        } catch(SQLException e) {
            System.out.println("Error al recorrer el ResultSet" +  e.getMessage()); 
        }
    }
}