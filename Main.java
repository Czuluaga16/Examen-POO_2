public class Main {
	public static void main(String[] args) {
		GestorReservas gestor = new GestorReservas(4);

		SalaTradicional t1 = new SalaTradicional("id_1", "Naruto", 50.0, false);
		t1.setDuracionMin(120);
		SalaTradicional t2 = new SalaTradicional("id_2", "Anaconda", 40.0, true);
		t2.setDuracionMin(95);

		Sala3D sala_1 = new Sala3D("3D1", "Pelicula los vengadores", 60.0, 10.0);
		Sala3D sala_2 = new Sala3D("3D2", "Pelicula Dragon ball z", 55.0, 12.5);

		gestor.agregarReserva(t1);
		gestor.agregarReserva(t2);
		gestor.agregarReserva(sala_1);
		gestor.agregarReserva(sala_2);

		double total = 0.0;
		for (int i = 0; i < gestor.getCantidadReservas(); i++) {
			Reserva r = gestor.getReserva(i);
			if (r == null) continue;
			System.out.println(r.obtenerDetalles());
			if (r instanceof Sala3D) {
				Sala3D s = (Sala3D) r;
				total += r.getCostoBase() + s.getValorLentes();
			} else {
				total += r.getCostoBase();
			}
		}

		System.out.println("Costo total: " + total);
	}
}
