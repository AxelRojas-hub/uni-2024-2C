package EJ10_Observer;

public class Reportero implements Observer {
    private String nombre;

    public Reportero(String nombre) {
        this.nombre = nombre;
    }

    public void update(String clima) {
        System.out.println(this.nombre + " fue notificado");
        System.out.println("El clima cambió a: " + clima + "\n");
    }
}
