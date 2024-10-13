package EJ12_Strategy;

public class Pelicula {
    private String nombre;
    private Integer edadMinima;

    public Pelicula(String nombre, Integer edadMinima) {
        this.nombre = nombre;
        this.edadMinima = edadMinima;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    @Override
    public String toString() {
        return nombre + "\t|\t" + "Edad minima: " + edadMinima;
    }
}
