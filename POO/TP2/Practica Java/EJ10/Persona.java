package EJ10;

public class Persona {
    private Integer edad;
    private String sexo;
    private boolean estudia;
    private boolean trabaja;
    private boolean puede_trabajar = false;
    private boolean puede_manejar = false;

    public Persona(Integer edad, String sexo, boolean estudia, boolean trabaja) {
        this.edad = edad;
        this.sexo = sexo;
        this.estudia = estudia;
        this.trabaja = trabaja;
        this.permiso();
    }

    private void permiso() {
        if (this.edad >= 16) {
            this.puede_trabajar = true;
            if (this.edad >= 17) {
                this.puede_manejar = true;
            }
        }
    }

    public boolean getPuede_trabajar() {
        return this.puede_trabajar;
    }

    public void setPuede_trabajar(boolean puede_trabajar) {
        this.puede_trabajar = puede_trabajar;
    }

    public boolean getPuede_manejar() {
        return this.puede_manejar;
    }

    public void setPuede_manejar(boolean puede_manejar) {
        this.puede_manejar = puede_manejar;
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
