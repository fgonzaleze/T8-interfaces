package ejercicio02;

public class Futbolista implements Comparable{
	/**
	 * Numero del jugador
	 */
	protected int numero;
	
	/**
	 * Nombre del jugador
	 */
	protected String nombre;
	/**
	 * Edad del jugador
	 */
	protected int edad;
	
	/**
	 * Goles que ha marcado el jugador
	 */
	protected int goles;
	
	/**
	 * Constructor del futbolista
	 * @param numero numero que viste el jugador
	 * @param nombre nombre del jugador
	 * @param edad edad del jugador
	 * @param goles numero de goles que ha marcado el jugador
	 */
	public Futbolista(int numero, String nombre, int edad, int goles) {

		if (numero>0) {
			this.numero = numero;
		}
	
		if (nombre!=null&&nombre!="") {
			this.nombre = nombre;
		}
		
		if (edad>0) {
			this.edad = edad;
		}
	
		if (goles>0) {
			this.goles = goles;
		}

	}
	
	/**
	 * Pasamos a cadena para mostrar el resultado
	 */
	public String toString() {
		
		String res;
		res = "Nombre del jugador: " + nombre + 
				"; \n" + " Numero del jugador: "+ numero +
				";\n" + " Edad: "+ edad + 
				";\n" + " Goles marcados: " + goles +"; \n" + " \n";
		return res;
	}

	@Override
	/**
	 * Para comparar dos objetos atendiendo a la camiseta y el nombre
	 * @return igual devuelve un booleano en true si la comparación se cumple
	 */
	public boolean equals(Object o) {
		boolean igual = false;
		// Igualamos el objeto al tipo de la clase; gracias Isa por explicar
		Futbolista jugador = (Futbolista) o;
		
		// La comparación en un if
		if (this.nombre.equalsIgnoreCase(jugador.nombre) && this.numero == jugador.numero) {
			igual = true;
		}
		return igual;
	}

	@Override
	/**
	 * Metodo compareTo que ordena los jugadores
	 */
	public int compareTo(Object o) {
		
		int res;
		//Otro cast igualamos para poder compararlos ya que object es la clase padre de java
		Futbolista jugador= (Futbolista) o;	
		res = this.numero - jugador.numero;
		if (res == 0) {
			res = this.nombre.compareToIgnoreCase(jugador.nombre);
		}
		return res;
	}

}
