public abstract class Cuenta {
    protected String dueño;
    protected Integer nroCuenta;
    protected Double saldo;

    public Cuenta(String dueño, Integer nroCuenta, Double saldo) {
        this.dueño = dueño;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public abstract void pagoconDebito(Double monto);

    public abstract void pagoconCredito(Double monto, Integer cantCuotas);

    public String getDueño() {
        return this.dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public Integer getNroCuenta() {
        return this.nroCuenta;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
