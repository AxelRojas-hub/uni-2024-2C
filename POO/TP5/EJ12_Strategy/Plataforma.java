package EJ12_Strategy;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private List<Pelicula> catalogo = new ArrayList<Pelicula>();
    private Estrategia estrategia;

    public Plataforma(List<Pelicula> peliculas) {
        this.catalogo = peliculas;
        this.estrategia = new Atp();
    }

    public void mostrarPeliculas() {
        estrategia.mostrarCatalogo(this.catalogo);
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
}
