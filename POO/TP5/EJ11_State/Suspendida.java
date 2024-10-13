package EJ11_State;

import java.util.List;

//     b.Suspendida:en este estado solo atiende a personas mayores a 60 años de edad,en otro caso imprime un mensaje de espera.
public class Suspendida implements EstadoCaja {
    @Override
    public void atenderCliente(List<Cliente> clientes) {
        System.out.println("Caja suspendida. Solo se atienden a personas mayores de 60 años.");
        Cliente sigCliente = null;
        for (Cliente cliente : clientes) {
            if (cliente.getEdad() >= 60) {
                sigCliente = cliente;
                System.out.println("Siguiente cliente: " + sigCliente.getNombre());
                return;
            }
        }
        if (sigCliente == null) {
            System.out.println("No hay personas mayores de 60 años en la fila.");
            return;
        }
    }
}
