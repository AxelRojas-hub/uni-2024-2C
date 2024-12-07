package EJ11_State;

import java.util.List;

// a.Abierta:imprime por pantalla al cliente próximo en la fila.
public class Abierta implements EstadoCaja {
    @Override
    public void atenderCliente(List<Cliente> clientes) {
        System.out.println("Cliente en caja: " + clientes.get(0).getNombre());
        clientes.remove(0);
        System.out.println("Proximo cliente: " + clientes.get(0).getNombre());
        System.out.println("Clientes en fila: " + clientes.size());
    }
}
