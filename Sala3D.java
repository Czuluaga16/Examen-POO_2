public class Sala3D extends Reserva {

    private double valorLentes;

    public Sala3D(String codigo, String nombrePelicula, double costoBase, double valorLentes) {
        super(codigo, nombrePelicula, costoBase);
        this.valorLentes = valorLentes;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " - Valor Lentes: " + valorLentes;
    }

    public double getValorLentes() {
        return valorLentes;
    }

    public void setValorLentes(double valorLentes) {
        this.valorLentes = valorLentes;
    }
}

