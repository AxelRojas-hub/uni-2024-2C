package EJ11_State;

import java.util.List;

// c.Cerrada: no atiende personas y muestra mensajes indicando su estado
public class Cerrada implements EstadoCaja {
    @Override
    public void atenderCliente(List<Cliente> clientes) {
        System.out.println("Caja cerrada. No se atienden clientes.");
    }

}
