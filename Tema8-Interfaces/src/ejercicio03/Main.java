package ejercicio03;

public class Main {

	public static void main(String[] args) {
		Polideportivo[] polideportivos =  new Polideportivo[2];
		EdificioOficina[] edificios = new EdificioOficina[2];
		
		// Poli = superficie, nombre y tipo
		Polideportivo p1 = new Polideportivo(650.30,"Polideportivo Cervantes","Polideportivo");
		Polideportivo p2 = new Polideportivo(490.50,"Centro de Ocio Infantes","CancHa");
		
		// Numero de oficinas, y superficie
		EdificioOficina e1 = new EdificioOficina(12,450);
		EdificioOficina e2 = new EdificioOficina(34,1670.80);
		
	}

}
