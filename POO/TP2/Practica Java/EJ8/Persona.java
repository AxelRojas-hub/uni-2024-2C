package EJ8;

public class Persona {
    private Integer edad;
    private String sexo;
    private boolean estudia;
    private boolean trabaja;

    public Persona(Integer edad, String sexo, boolean estudia, boolean trabaja) {
        this.edad = edad;
        this.sexo = sexo;
        this.estudia = estudia;
        this.trabaja = trabaja;
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

}
