package EJ12;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String direccion;
    private ArrayList<Persona> empleados;

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<Persona>();
    }

    public void addEmpleado(Persona persona) {
        this.empleados.add(persona);
    }

    public Integer getCantidadEmpleados() {
        return this.empleados.size();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Persona> getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(ArrayList<Persona> empleados) {
        this.empleados = empleados;
    }

}
