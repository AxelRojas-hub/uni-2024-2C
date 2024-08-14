package EJ2;

public class Cancion {
    private String nombre = "";
    private String autor = "";
    private Double duracion = 0.0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Cancion(String nombre, String autor, Double duracion) {
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
    }

}
