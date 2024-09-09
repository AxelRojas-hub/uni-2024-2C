package Punto2;

import java.util.ArrayList;

public class Familia {
    private String apellido;
    private ArrayList<Persona> integrantes;

    public Familia(String apellido) {
        this.apellido = apellido;
        this.integrantes = new ArrayList<Persona>();
    }

    // GETTERS Y SETTERS
    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Persona> getIntegrantes() {
        return this.integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    public void addIntegrante(Persona integrante) {
        this.getIntegrantes().add(integrante);
    };

    // PROCESAMIENTO
    public Double getPromedioEdad() {
        Double sumaEdad = 0.0;
        ArrayList<Persona> integrantes = this.getIntegrantes();
        for (Persona persona : integrantes) {
            sumaEdad += persona.getEdad();
        }
        return sumaEdad / integrantes.size();
    }

    public void printFamData() {
        System.out.println("\nFamilia " + this.getApellido());
        // Limita el double a dos decimales con String.format()
        String edadFormateada = String.format("Promedio de edad: %.1f", this.getPromedioEdad());
        System.out.println(edadFormateada);
        System.out.println("Integrantes:");
        for (Persona persona : this.getIntegrantes()) {
            System.out.println(persona.getNombre());
        }
    }
}
