package EJ10_Observer;

// Aplique el patrón de diseño Observer para un sistema de reporte del clima,defina la clase Sistema Meteorológico que extienda de la clase Observable y tenga como atributo el estado del clima en forma de String.
//Cada vez que se modifica el clima esté notifica a todos los observadores
//El observador va a ser la clase Reportero que implementa la interfaz Observer,él será el encargado de imprimir por consola el clima cuando cambia en el sistema meteorológico
// Pruebe el sistema creando instancias de cada clase y cambiando el clima.
public class App {
    public static void main(String[] args) {
        SistemaMeteorologico sistema = new SistemaMeteorologico("Soleado");
        Reportero reportero1 = new Reportero("Reportero 1");
        Reportero reportero2 = new Reportero("Reportero 2");

        sistema.addObserver(reportero1);
        sistema.addObserver(reportero2);

        sistema.setClima("Nublado");
    }
}
