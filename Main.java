public class Main {
	public static void main(String[] args) {
		// Gestor con capacidad mínima de 4
		GestorReservas gestor = new GestorReservas(4);

		// Crear y agregar 2 salas tradicionales
		SalaTradicional t1 = new SalaTradicional("T1", "Naruto", 50.0, false);
		t1.setDuracionMin(120);
		gestor.agregarReserva(t1);

		SalaTradicional t2 = new SalaTradicional("T2", "Anaconda", 40.0, true);
		t2.setDuracionMin(95);
		gestor.agregarReserva(t2);

		// Crear y agregar 2 salas 3D
		Sala3D s1 = new Sala3D("3D1", "Los Vengadores", 60.0, 10.0);
		gestor.agregarReserva(s1);

		Sala3D s2 = new Sala3D("3D2", "Dragon Ball Z", 55.0, 12.5);
		gestor.agregarReserva(s2);

		// Calcular el costo total de manera sencilla (sin bucles complejos)
		double total = 0.0;
		// Para principiantes: vamos sumando el costo justo después de crear/añadir cada sala
		total += t1.getCostoBase();
		total += t2.getCostoBase();
		total += s1.getCostoBase() + s1.getValorLentes();
		total += s2.getCostoBase() + s2.getValorLentes();

		// Mostrar detalles usando el gestor (método ya implementado)
		System.out.println("Detalles de las reservas:");
		gestor.mostrarDetallesSalas();

		// Mostrar total
		System.out.println("Costo total: " + total);
	}
}
