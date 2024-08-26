package EJ9;

public abstract class TarifaProveedor {
    protected Double sms = 1.00;
    protected Double minutosLlamada = 15.00;
    protected Double gigasInternet = 20.00;

    public void setGigasInternet(Double gigasInternet) {
        this.gigasInternet = gigasInternet;
    }

    public abstract String getNombre();

    public Double calcular(Integer totalSMS, Double totalMinutos, Double totalGigas) {
        return calcularSMS(totalSMS) + calcularMinutosDeLlamada(totalMinutos) + calcularConsumoGB(totalGigas);
    }

    public Double calcularSMS(Integer totalSMS) {
        return totalSMS * this.minutosLlamada;
    }

    public Double calcularMinutosDeLlamada(Double minutos) {
        return minutos * minutosLlamada;
    }

    public Double calcularConsumoGB(Double totalGB) {
        return totalGB * this.gigasInternet;
    }

    public Double getSms() {
        return sms;
    }

    public void setSms(Double sms) {
        this.sms = sms;
    }

    public Double getMinutosLlamada() {
        return minutosLlamada;
    }

    public void setMinutosLlamada(Double minutosLlamada) {
        this.minutosLlamada = minutosLlamada;
    }

    public Double getGigasInternet() {
        return gigasInternet;
    }

    // Implementar metodo toString que llame a .getnombre()
    public void mostrarTarifas(Integer cantsms, Double minLlamadas, Double cantGB) {
        System.out.println("Tarifas " + this.getNombre());
        System.out.println("SMS: " + this.calcularSMS(cantsms));
        System.out.printf("Minutos de llamada: %,.2f%n", this.calcularMinutosDeLlamada(minLlamadas));
        System.out.printf("Gigas de internet: %,.2f%n", this.calcularConsumoGB(cantGB));
        System.out.println("-------------------------");
    }
}