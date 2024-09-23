import java.util.Random;

public class App {
    Random random = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        @SuppressWarnings("unused")
        String periodo = meses[random.nextInt(13)];
    }
}
