import java.util.ArrayList;

public class Especial extends Jugador {
    private ArrayList<String> listaHabilidades;

    public Especial(String nombre, String equipo, String pais) {
        super(nombre, equipo, pais);
        this.listaHabilidades = new ArrayList<String>();
        this.quimica = 100;
    }

    @Override
    public void calcularQuimica(String equipoFav, String paisFav) {
        this.setQuimica(100);
    }

    public ArrayList<String> getListaHabilidades() {
        return this.listaHabilidades;
    }

    // Agrega una habilidad a la lista
    public void addHabilidad(String habilidad) {
        this.listaHabilidades.add(habilidad);
    }

    // Valores entre 89 y 99, sumandole un 2%. Si supera el maximo, queda en 99
    public void setAtributos() {
        Integer minimo = 89;
        Integer maximo = 99;
        Double multiplicador = 1.02;
        this.velocidad = validaMax(generarAtributo(minimo, maximo, multiplicador));
        this.tiro = validaMax(generarAtributo(minimo, maximo, multiplicador));
        this.regate = validaMax(generarAtributo(minimo, maximo, multiplicador));
        this.defensa = validaMax(generarAtributo(minimo, maximo, multiplicador));
        this.pase = validaMax(generarAtributo(minimo, maximo, multiplicador));
        this.fisico = validaMax(generarAtributo(minimo, maximo, multiplicador));
    }

    // Si supera el maximo, queda en 99
    public Integer validaMax(Integer valor) {
        return (valor > 99) ? 99 : valor;
        // Si valor > 99, retorna 99, sino retorna valor
    }

    public String toString() {
        String firstLine = "Nombre:" + this.getNombre() + "\tQuimica: " + this.getQuimica();
        String secLine = "\nEquipo:" + this.getEquipo() + "\nPais:" + this.getPais();
        String thirdLine = "\nVelocidad:" + this.getVelocidad() + "\tTiro: " + getTiro();
        String fourthLine = "\nRegate:" + this.getRegate() + "\tDefensa: " + getDefensa();
        String lastLine = "\nPase:" + this.getPase() + "\tFisico: " + getFisico();
        return firstLine + secLine + thirdLine + fourthLine + lastLine;
    }
}
