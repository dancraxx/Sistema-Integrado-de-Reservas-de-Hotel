package model;

public class HabitacionSuite extends Habitacion {
	
	public HabitacionSuite() {
		super();
	}
	
	public HabitacionSuite(String n, double pB, int cM) {
		super(n, pB, cM);
	}
	
	public double calcularPrecio(int noches) {
		return noches;
	}

}
