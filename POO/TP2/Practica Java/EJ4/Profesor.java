package EJ4;

import java.util.ArrayList;

public class Profesor {
    private String nombre = "";
    private String apellido = "";

    private ArrayList<Materia> materias = new ArrayList<>();

    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public ArrayList<Materia> getMateria() {
        return this.materias;
    }

    public void addMateria(Materia materia) {
        this.materias.add(materia);
    }
}
