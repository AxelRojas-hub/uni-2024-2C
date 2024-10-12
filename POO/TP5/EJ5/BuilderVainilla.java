package EJ5;

public class BuilderVainilla extends TortaBuilder {

    public BuilderVainilla() {
        torta = new Torta("Torta de Vainilla");
    }

    @Override
    public void buildMasa() {
        torta.setMasa("Vainilla");
    }

    @Override
    public void buildRelleno() {
        torta.setRelleno("Crema");
    }
}
