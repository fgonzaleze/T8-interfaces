package ejercicio02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		// Nos creamos un array de tipo Futbolista.
		Futbolista[] equipo = new Futbolista[6];

		// Creamos los futbolistas
		equipo[0] = new Futbolista(11, "Coentrao", 20, 12);
		equipo[1] = new Futbolista(2, "Cristiano", 35, 90);
		equipo[2] = new Futbolista(3, "Ronaldinho", 41, 980);
		equipo[3] = new Futbolista(2, "Messi", 33, 981);
		equipo[4] = new Futbolista(7, "Casillas", 42, 1);
		equipo[5] = new Futbolista(9, "Riquelme", 51, 0);

		// Ordenamos con sorta ya que todos los elementos del array implementan la
		// interfaz Comparable
		Arrays.sort(equipo);

		// Imprimimos el array con toString para mostrar
		System.out.println(Arrays.toString(equipo));

	}

}
