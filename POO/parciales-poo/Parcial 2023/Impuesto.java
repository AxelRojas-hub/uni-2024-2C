public class Impuesto {
    private String nombre;
    private Double monto;
    private Boolean cobrado;
    private String periodo;

    public Impuesto(String nombre, Double monto, Boolean cobrado) {
        this.nombre = nombre;
        this.monto = monto;
        this.cobrado = cobrado;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void validarPago(Double monto, String periodo, String nroComprobante) {

    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Boolean getCobrado() {
        return cobrado;
    }

    public void setCobrado(Boolean cobrado) {
        this.cobrado = cobrado;
    }
}
