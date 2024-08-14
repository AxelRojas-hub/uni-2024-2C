package EJ7;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer get_edad(LocalDate fechaNacimiento) {
        LocalDate hoy = LocalDate.now();
        return (int) ((DAYS.between(fechaNacimiento, hoy)) / 365);
    }

    public String toString() {
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido + "\nFecha de Nacimiento: "
                + this.fechaNacimiento + ", Edad:" + this.get_edad(fechaNacimiento) + "\n";
    }

}
