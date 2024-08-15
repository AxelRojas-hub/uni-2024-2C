package EJ10;

import java.util.ArrayList;

public class Familia {
    private Integer idFamilia = 0;
    private ArrayList<Persona> personas;

    public Familia(Integer idFamilia, ArrayList<Persona> personas) {
        this.idFamilia = idFamilia;
        this.personas = personas;
    }

    public Integer getIdFamilia() {
        return this.idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void addpersona(Persona persona) {
        this.personas.add(persona);
    }
}
