public class CuentaBanco extends Cuenta {
    public Integer cbu;

    public CuentaBanco(String dueño, Integer nroCuenta, Double saldo, Integer cbu) {
        super(dueño, nroCuenta, saldo);
        this.cbu = cbu;
    }

    public void pagoconDebito(Double monto) {
        this.saldo -= monto;
        this.saldo += (monto * 0.1);
    };

    public void pagoconCredito(Double monto, Integer cantCuotas) {
        if (cantCuotas > 3) {
            // Calcula % interes
            Double interes = 0.02 * cantCuotas;
            // Calcula el monto total
            monto += monto * interes;
            // Resta el valor de una cuota
            this.saldo -= monto / cantCuotas;
        } else {
            this.saldo -= monto / cantCuotas;
        }
    };

    public Integer getCbu() {
        return cbu;
    }

    public void setCbu(Integer cbu) {
        this.cbu = cbu;
    }
}
