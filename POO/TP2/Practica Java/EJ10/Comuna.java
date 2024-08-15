package EJ10;

import java.util.ArrayList;

public class Comuna {
    private String nombre;
    private ArrayList<Familia> familias;

    public Comuna(String nombre) {
        this.nombre = nombre;
        this.familias = new ArrayList<Familia>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Familia> getFamilias() {
        return this.familias;
    }

    public void setFamilias(ArrayList<Familia> familias) {
        this.familias = familias;
    }

    public void addFamilia(Familia familia) {
        this.familias.add(familia);
    }

    public Integer familiasCensadas() {
        return (this.familias).size();
    }

    public Integer getCantidadPersonas() {
        Integer cantidadPersonas = 0;
        for (Familia familia : this.familias) {
            cantidadPersonas += familia.getPersonas().size();
        }
        return cantidadPersonas;
    }

    public Double getPromedioEdad() {
        Integer suma = 0;
        for (Familia familia : this.familias) {
            for (Persona persona : familia.getPersonas()) {
                suma = suma + persona.getEdad();
            }
        }
        double sumaD = suma;
        return (sumaD / this.getCantidadPersonas());
    }

    public Integer getCantidadTrabajadores() {
        Integer trabajadores = 0;
        for (Familia familia : this.familias) {
            for (Persona persona : familia.getPersonas()) {
                if (persona.getTrabaja()) {
                    trabajadores = trabajadores + 1;
                }
            }
        }
        return trabajadores;
    }
}
