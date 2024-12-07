package EJ5_Builder;

public class Director {
    private TortaBuilder tortaBuilder;

    public Torta getTorta() {
        return this.tortaBuilder.getTorta();
    }

    public Director(TortaBuilder tortaBuilder) {
        this.tortaBuilder = tortaBuilder;
    }

    public void setBuilder(TortaBuilder tortaBuilder) {
        this.tortaBuilder = tortaBuilder;
    }

    public void crearTortaVainilla() {
        this.tortaBuilder.crearNuevaTorta("Torta de vainilla");
        this.tortaBuilder.buildMasa();
        this.tortaBuilder.buildRelleno();
    }

    public void crearTortaCoco() {
        this.tortaBuilder.crearNuevaTorta("Torta de coco");
        this.tortaBuilder.buildMasa();
        this.tortaBuilder.buildRelleno();
    }

}
