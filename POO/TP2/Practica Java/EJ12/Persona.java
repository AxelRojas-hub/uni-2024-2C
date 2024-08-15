package EJ12;

public class Persona {
    private Integer edad;
    private String sexo;
    private Puesto puesto;
    private boolean estudia;
    private boolean trabaja;

    public Persona(Integer edad, String sexo, boolean estudia, boolean trabaja, String puesto) {
        this.edad = edad;
        this.sexo = sexo;
        this.estudia = estudia;
        this.trabaja = trabaja;
        this.puesto = new Puesto(puesto);
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean getEstudia() {
        return this.estudia;
    }

    public void setEstudia(boolean estudia) {
        this.estudia = estudia;
    }

    public boolean getTrabaja() {
        return this.trabaja;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }

    public String toString() {
        return ("Edad:" + this.edad + ", Sexo:" + this.sexo + "\nEstudia:" + this.estudia + ", Trabaja:" + this.trabaja
                + "\nPuesto:" + this.puesto.getNombre());
    }

}
