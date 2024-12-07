package EJ10_Observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaMeteorologico implements Observable {
    private String clima;
    private List<Reportero> reporteros = new ArrayList<Reportero>();

    public SistemaMeteorologico(String clima) {
        this.clima = clima;
        System.out.println("Estado inicial: " + clima + "\n");
    }

    public void setClima(String clima) {
        this.clima = clima;
        System.out.println("El sistema cambió el estado\n");
        this.notifyObservers();
    }

    public void addObserver(Reportero reportero) {
        this.reporteros.add(reportero);
    }

    public void removeObserver(Reportero reportero) {
        this.reporteros.remove(reportero);
    }

    public void notifyObservers() {
        for (Reportero reportero : reporteros) {
            reportero.update(clima);
        }
    }

}
