package EJ5_Builder;

public abstract class TortaBuilder {
    protected Torta torta;

    public Torta getTorta() {
        return torta;
    }

    public void crearNuevaTorta(String nombre) {
        torta = new Torta(nombre);
    }

    public abstract void buildMasa();

    public abstract void buildRelleno();
}
