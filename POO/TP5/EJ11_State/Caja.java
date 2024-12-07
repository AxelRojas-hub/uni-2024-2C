package EJ11_State;

import java.util.ArrayList;
import java.util.List;

public class Caja {
    private String nombreCajero;
    private EstadoCaja estadoCaja;
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public Caja(String nombreCajero, List<Cliente> clientes) {
        this.nombreCajero = nombreCajero;
        this.clientes = clientes;
        this.estadoCaja = new Abierta();
    }

    public void derivaClienteAEstado() {
        System.out.println("Cajero: " + nombreCajero);
        estadoCaja.atenderCliente(clientes);
    }

    public void setEstado(EstadoCaja estado) {
        this.estadoCaja = estado;
    }
}
