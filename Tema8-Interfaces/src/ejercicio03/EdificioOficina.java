package ejercicio03;

public class EdificioOficina implements Edificio{

	public int numOficinas;
	public double superficieOfi;

	EdificioOficina() {

	}

	public EdificioOficina(int numOficinas, double superficieOfi) {
		if (numOficinas >= 0) {
			this.numOficinas = numOficinas;
		}
		if (superficieOfi > 0) {
			this.superficieOfi = superficieOfi;
		}
	}

	

	@Override
	public double getSuperficieEdificio() {
		double superficie = 0;
		if (this.superficieOfi > 0 && this.numOficinas > 0) {
			// La superficie del edificio con todas las oficinas sera la multiplicación de la superficie de las oficinas por la cantidad de las mismas. 
			superficie = this.superficieOfi * this.numOficinas;
		}
		return superficie;
	}

}
