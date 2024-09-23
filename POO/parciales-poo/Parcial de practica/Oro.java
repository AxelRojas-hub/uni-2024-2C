public class Oro extends Jugador {

    public Oro(String nombre, String equipo, String pais) {
        super(nombre, equipo, pais);
    }

    // Genera valores entre 74 y 90, al resultado le suma un 5% sobre la base.
    public void setAtributos() {
        Integer minimo = 74;
        Integer maximo = 90;
        Double multiplicador = 1.05;
        this.velocidad = generarAtributo(minimo, maximo, multiplicador);
        this.tiro = generarAtributo(minimo, maximo, multiplicador);
        this.regate = generarAtributo(minimo, maximo, multiplicador);
        this.defensa = generarAtributo(minimo, maximo, multiplicador);
        this.pase = generarAtributo(minimo, maximo, multiplicador);
        this.fisico = generarAtributo(minimo, maximo, multiplicador);
    }

    public String toString() {
        String firstLine = "Nombre:" + this.getNombre() + "\tQuimica: " + this.getQuimica();
        String secLine = "\nEquipo:" + this.getEquipo() + "\nPais:" + this.getPais() + "\n";
        String thirdLine = "Velocidad:" + this.getVelocidad() + "\tTiro: " + this.getTiro();
        String fourthLine = "\nRegate:" + this.getRegate() + "\tDefensa: " + this.getDefensa();
        String lastLine = "\nPase:" + this.getPase() + "\tFisico: " + this.getFisico();
        return firstLine + secLine + thirdLine + fourthLine + lastLine;
    }
}
