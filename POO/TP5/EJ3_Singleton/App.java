package EJ3_Singleton;

public class App {
    public static void main(String[] args) {
        Database bd1 = Database.getInstancia();
        bd1.ejecutarConsulta("SELECT * FROM alumno");
    }
}