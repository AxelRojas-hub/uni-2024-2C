package EJ5_Builder;

public class BuilderCoco extends TortaBuilder {
    public BuilderCoco() {
        torta = new Torta("Torta de Coco");
    }

    @Override
    public void buildMasa() {
        torta.setMasa("Coco");
    }

    @Override
    public void buildRelleno() {
        torta.setRelleno("Dulce de leche");
    }
}
