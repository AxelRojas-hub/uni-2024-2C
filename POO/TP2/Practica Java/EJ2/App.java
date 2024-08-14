package EJ2;

public class App {
    public static void main(String[] args) {
        String nombre = "Un velero llamado libertad";
        String autor = "Jose Luis Perales";
        Double duracion = 222.0;
        Cancion cancion = new Cancion(nombre, autor, duracion);

        System.out.println(cancion.getNombre());
        System.out.println(cancion.getAutor());
        System.out.println(cancion.getDuracion());
    }
}
