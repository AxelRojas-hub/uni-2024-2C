public class BronceEspecial extends Jugador {
    private String habilidadEspecial;

    public BronceEspecial(String nombre, String equipo, String pais, String habilidadEspecial) {
        super(nombre, equipo, pais);
        this.habilidadEspecial = habilidadEspecial;
    }

    // Genera valores entre 49 y 65, al resultado le suma 2 sobre la base.
    public void setAtributos() {
        Integer minimo = 49;
        Integer maximo = 65;
        Double multiplicador = 1.0;
        this.velocidad = generarAtributo(minimo, maximo, multiplicador) + 2;
        this.tiro = generarAtributo(minimo, maximo, multiplicador) + 2;
        this.regate = generarAtributo(minimo, maximo, multiplicador) + 2;
        this.defensa = generarAtributo(minimo, maximo, multiplicador) + 2;
        this.pase = generarAtributo(minimo, maximo, multiplicador) + 2;
        this.fisico = generarAtributo(minimo, maximo, multiplicador) + 2;
    }

    public String toString() {
        String firstLine = "Habilidad especial\n" + this.getHabilidadEspecial();
        String secLine = "\nNombre:" + this.getNombre() + "\tQuimica: " + this.getQuimica();
        String thirdLine = "\nEquipo:" + this.getEquipo() + "\nPais:" + this.getPais();
        String fourthLine = "\nVelocidad:" + this.getVelocidad() + "\tTiro: " + getTiro();
        String fifthLine = "\nRegate:" + this.getRegate() + "\tDefensa: " + getDefensa();
        String lastLine = "\nPase:" + this.getPase() + "\tFisico: " + getFisico();
        return firstLine + secLine + thirdLine + fourthLine + fifthLine + lastLine;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
}
