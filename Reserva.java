public class Reserva {

    private String codigo;
    private String nombrePelicula;
    private double costoBase;

    public Reserva(String codigo, String nombrePelicula, double costoBase) {
        this.codigo = codigo;
        this.nombrePelicula = nombrePelicula;
        this.costoBase = costoBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }
    
    public String obtenerDetalles() {
        return "Código: " + codigo + ", Película: " + nombrePelicula + ", Costo Base: " + costoBase;
    
        
    }

    public double getCostoBase() {
        return costoBase;
    }
}