package ejercicio01;

public class Socio implements Comparable {

	protected int id;

	protected String nombre;

	protected int edad;
	
	/**
	 * Constructor con los datos del socio
	 * @param id num identificativo del socio
	 * @param nombre nombre del socio
	 * @param edad edad del socio
	 */
	public Socio(int id, String nombre, int edad) {
		if (id >= 0) {
			this.id = id;
		}
		if (nombre != null && nombre != "") {
			this.nombre = nombre;
		}
		if (edad >= 0) {
			this.edad = edad;
		}
	}
	
	/**
	 * Metodo para imprimir el resultado
	 */
	public String toString() {
		// Cadena vacia para el resultado
		String res = "";
		res = "ID: " + id + " ;\n" + 
				"Nombre: " + nombre + " ;\n" + 
				"Edad: " + edad + " años; \n";
		return res;

	}
	
	/**
	 * Metodo que ordena los socios según su id de menor a mayor
	 */
	@Override
	public int compareTo(Object o) {
		int resultado = 0;
		Socio sosio = (Socio) o;
		resultado = this.id - sosio.id;
		return resultado;
	}

}
