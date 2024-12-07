package EJ5_Builder;

public class App {
    public static void main(String[] args) throws Exception {
        BuilderCoco builderCoco = new BuilderCoco();
        BuilderVainilla builderVainilla = new BuilderVainilla();

        Director director = new Director(builderCoco);

        director.crearTortaCoco();
        Torta tortaCoco = director.getTorta();
        System.out.println(tortaCoco.toString());

        director.setBuilder(builderVainilla);
        director.crearTortaVainilla();
        Torta tortaVainilla = director.getTorta();

        System.out.println(tortaVainilla.toString());
    }
}
