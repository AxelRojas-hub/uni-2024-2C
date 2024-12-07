public class BilleteraVirtual extends Cuenta {
    public Integer cvu;

    public BilleteraVirtual(String dueño, Integer nroCuenta, Double saldo, Integer cbu) {
        super(dueño, nroCuenta, saldo);
        this.cvu = cbu;
    }

    public void pagoconDebito(Double monto) {
        this.saldo -= monto;
        this.saldo += (monto * 0.1);
    };

    public void pagoconCredito(Double monto, Integer cantCuotas) {
        if (cantCuotas > 3) {
            // Calcula % interes
            Double interes = 0.08 * cantCuotas;
            // Calcula el monto total
            monto += monto * interes;
            // Resta el valor de una cuota
            this.saldo -= monto / cantCuotas;
        } else {
            this.saldo -= monto / cantCuotas;
        }
    };

    public Integer getCvu() {
        return this.cvu;
    }

    public void setCvu(Integer cvu) {
        this.cvu = cvu;
    };
}
