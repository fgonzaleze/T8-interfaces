package ejercicio01;

import java.util.Arrays;

/*
 * Implementa la clase Socio que tiene los siguientes atributos:
 * id: número identificativo del socio.
 * nombre
 * edad
 * Añade un constructor con parámetros y el método toString.
 * Haz que Socio implemente la interfaz Comparable e implementa el método compareTo de forma que los socios se ordenen por los números de identificación (id) crecientes.
 * Crea un main donde compruebes que la comparación funciona correctamente. 
 * Crea, además, un array de tipo Socio y ordénalo. Comprueba que la ordenación del array es correcta.
 */

public class Main {

	public static void main(String[] args) {
		// Creamos 2 socios para comparar sus ids
		Socio s1= new Socio (2, "Juan", 29);
		Socio s2= new Socio (5, "Jaime", 19);
		// Guardamos la comparacion en una variable
		int compararID = s1.compareTo(s2) ;
		// Si el resultado es 0 es que ambos tienen el mismo ID
		if (compararID == 0) {
			System.out.println("Los socios tiene el mismo ID");
		// Si el resultado es mayor que 0, el socio 2 irá antes
		} if (compararID > 0) {
			System.out.println(s2);
			System.out.println(s1);
		// En cambio si el id es menor que 0, el socio 1 irá primero
		} if (compararID < 0) {
			System.out.println(s1);
			System.out.println(s2);
		}
		
		// Creamos un array para meter 5 socios
		Socio[] socios = new Socio[5];
		
		// Rellenamos el club de los 5
		socios[0] = new Socio(3, "Pedro Gallardo", 18);
		socios[1] = new Socio(8, "Juanma Gallego", 18);
		socios[2] = new Socio(2, "Miguel Dominguez", 18);
		socios[3] = new Socio(6, "Isabel Katharina", 24);
		socios[4] = new Socio(12, "Javier Gonzalez", 28);
		
		// Imprimimos
		System.out.println(Arrays.toString(socios));
	}

}
