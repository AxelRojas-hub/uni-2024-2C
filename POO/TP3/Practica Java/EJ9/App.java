package EJ9;

public class App {
    public static void main(String[] args) {
        // Genera att aleatorios
        Integer cantSMS = (int) (Math.random() * 100) + 1;
        Double minLlamadas = (Math.random() * 300) + 1;
        Double cantGB = (Math.random() * 10) + 1;
        // Instancia con el nombre de la compañia
        Claro claro = new Claro("Claro");
        Personal personal = new Personal("Personal");
        Movistar movistar = new Movistar("Movistar");
        // Imprime
        String strMinutos = String.format("\tMinutos de llamada: %,.2f", minLlamadas);
        String strGB = String.format("\tConsumo de gigabytes de internet: %,.2f%n-------------------------", cantGB);

        System.out.println("\nCantidad sms: " + cantSMS + strMinutos + strGB);
        claro.mostrarTarifas(cantSMS, minLlamadas, cantGB);
        personal.mostrarTarifas(cantSMS, minLlamadas, cantGB);
        movistar.mostrarTarifas(cantSMS, minLlamadas, cantGB);
    }
}
