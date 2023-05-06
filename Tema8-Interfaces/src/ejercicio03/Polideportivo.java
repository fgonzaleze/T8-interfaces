package ejercicio03;

// Un polideportivo es al mismo tiempo una instalación deportiva y un edificio; 
// en Java interesa conocer la superficie que tiene y el nombre que tiene. 

public class Polideportivo implements Edificio, InstalacionDeportiva {

	protected double superficie;
	protected String nombre;
	protected String tipo;

	Polideportivo() {

	}

	public Polideportivo(double superficie, String nombre, String tipo) {

		if (superficie > 0) {
			this.superficie = superficie;
		}
		if (nombre != null && nombre != "") {
			this.nombre = nombre;
		}
		if (nombre != null && nombre != "") {
			this.tipo = tipo;
		}
	}

	@Override
	public int getTipoInstalacion() {
		int codigoInstalacion = 1;

		if (this.tipo.equalsIgnoreCase("polideportivo")) {
			codigoInstalacion = 1;
		} else if (this.tipo.equalsIgnoreCase("cancha")) {
			codigoInstalacion = 2;
		}
		return codigoInstalacion;
	}

	@Override
	public double getSuperficieEdificio() {
		double superficie = 0;
		if (this.superficie > 0) {
			superficie = this.superficie;
		}
		return superficie;
	}

}
