package model;

public class HabitacionSimple extends Habitacion {

	public HabitacionSimple() {
		super();
	}
	
	public HabitacionSimple(String n, double pB, int cM) {
		super(n, pB, cM);
	}
	
	public double calcularPrecio(int noches) {
		return noches;
	}

}
