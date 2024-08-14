package EJ3;

public class App {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Alejandro");
        alumno1.setApellido("Rojas");
        alumno1.setDni(11111111);

        Alumno alumno2 = new Alumno("Martin", "Rosales");
        alumno2.setDni(22222222);

        System.out.println(alumno1.getNombreYapellido() + " - DNI: " + alumno1.getDni());
        System.out.println(alumno2.getNombreYapellido() + " - DNI: " + alumno2.getDni());
    }
}
