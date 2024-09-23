import java.util.Random;

public abstract class Jugador {
    protected String nombre;
    protected String equipo;
    protected String pais;
    protected Integer velocidad;
    protected Integer tiro;
    protected Integer regate;
    protected Integer defensa;
    protected Integer pase;
    protected Integer fisico;
    protected Integer quimica = 0;

    public Jugador(String nombre, String equipo, String pais) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.pais = pais;
        this.setAtributos();
    }

    protected Integer generarAtributo(Integer min, Integer max, Double multiplicador) {
        Random random = new Random();
        Integer valorBase = min + random.nextInt(max - min + 1);
        return (int) (valorBase * multiplicador);
    };

    public abstract void setAtributos();

    public void calcularQuimica(String equipoFav, String paisFav) {
        if (this.equipo.equals(equipoFav) && this.pais.equals(paisFav)) {
            this.setQuimica(100);
        } else if (this.equipo.equals(equipoFav) || this.pais.equals(paisFav)) {
            this.setQuimica(80);
        }
    }

    public String getEquipo() {
        return this.equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getTiro() {
        return this.tiro;
    }

    public void setTiro(Integer tiro) {
        this.tiro = tiro;
    }

    public Integer getRegate() {
        return this.regate;
    }

    public void setRegate(Integer regate) {
        this.regate = regate;
    }

    public Integer getDefensa() {
        return this.defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    public Integer getPase() {
        return this.pase;
    }

    public void setPase(Integer pase) {
        this.pase = pase;
    }

    public Integer getFisico() {
        return this.fisico;
    }

    public void setFisico(Integer fisico) {
        this.fisico = fisico;
    }

    public Integer getQuimica() {
        return quimica;
    }

    public void setQuimica(Integer quimica) {
        this.quimica = quimica;
    };

}
