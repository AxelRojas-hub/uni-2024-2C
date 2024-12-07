package EJ11_State;

import java.util.ArrayList;
import java.util.List;

// Aplique el patrón State para simular el funcionamiento de atención de una caja en un banco.La clase Banco tiene una caja y este puede atender una persona,suspender,cerrar y abrir la caja.La caja tiene el nombre del cajero y el estado actual,los estados posibles son.
//     a.Abierta:imprime por pantalla al cliente próximo en la fila.
//     b.Suspendida:en este estado solo atiende a personas mayores a 60 años de edad,en otro caso imprime un mensaje de espera.
//     c.Cerrada:no atiende personas y muestra mensajes indicando su estado
// Pruebe el correcto funcionamiento del sistema creando personas con diferentes edades y cambiando los estados de la caja.
public class App {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        for (int i = 1; i <= 10; i++) {
            clientes.add(new Cliente("Cliente " + i, i * 10));
        }
        Caja caja = new Caja("Cajero 1", clientes);
        Banco banco = new Banco(caja); // Por defecto la caja esta abierta
        System.out.println("------------ Caja Abierta ------------\n");
        banco.derivaClientesACaja();
        System.out.println("\n------------ Caja Cerrada ------------\n");
        banco.cerrarCaja();
        banco.derivaClientesACaja();
        System.out.println("\n------------ Caja Suspendida ---------\n");
        banco.suspenderCaja();
        banco.derivaClientesACaja();
    }
}
