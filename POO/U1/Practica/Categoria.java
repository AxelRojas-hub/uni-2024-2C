import java.util.ArrayList;

public class Categoria {
    private String titulo;
    private ArrayList<Serie> series;

    public Categoria(String titulo) {
        this.titulo = titulo;
        this.series = new ArrayList<>();
    }

    public void agregarSerie(Serie ser) {
        this.series.add(ser);
    }

    public void imprimir() {

    }
}
