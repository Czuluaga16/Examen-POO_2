public class SalaTradicional  extends Reserva {

    private boolean tiene3D;
    private int duracionMin;

    public SalaTradicional(String codigo, String nombrePelicula, double costoBase, boolean tiene3D) {
        super(codigo, nombrePelicula, costoBase);
        super.obtenerDetalles();
        this.tiene3D = tiene3D;
    }

    public boolean Tiene3D() {
        return tiene3D;
    }

    public void setTiene3D(boolean tiene3D) {
        this.tiene3D = tiene3D;
    }

    public int getDuracionMin() {
        return duracionMin;
    }
    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }
    
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " - Duración: " + duracionMin + " min";
    }
}
