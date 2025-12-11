
public class GestorReservas {
    private Reserva[] reservas;
    private int contador;

    public GestorReservas() {
        reservas = new Reserva[10];
        contador = 0;
    }

    public GestorReservas(int capacidad) {
        reservas = new Reserva[ (capacidad > 0) ? capacidad : 10 ];
        contador = 0;
    }

    public void agregarReserva(Reserva r) {
        if (r == null) return;
        if (contador >= reservas.length) {
            Reserva[] nuevo = new Reserva[reservas.length * 2];
            System.arraycopy(reservas, 0, nuevo, 0, reservas.length);
            reservas = nuevo;
        }
        reservas[contador++] = r;
    }

    public void mostrarDetallesSalas() {
        for (int i = 0; i < contador; i++) {
            System.out.println(reservas[i].obtenerDetalles());
        }
    }

    public int getCantidadReservas() {
        return contador;
    }

    public Reserva getReserva(int index) {
        if (index < 0 || index >= contador) return null;
        return reservas[index];
    }
}
