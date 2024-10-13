package EJ11_State;

//Context
public class Banco {
    private Caja caja;

    public Banco(Caja caja) {
        this.caja = caja;
    }

    public void derivaClientesACaja() {
        caja.derivaClienteAEstado();
    }

    public void suspenderCaja() {
        caja.setEstado(new Suspendida());
    }

    public void abrirCaja() {
        caja.setEstado(new Abierta());
    }

    public void cerrarCaja() {
        caja.setEstado(new Cerrada());
    }
}
