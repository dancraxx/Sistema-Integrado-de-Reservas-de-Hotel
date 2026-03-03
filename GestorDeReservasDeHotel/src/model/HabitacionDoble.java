package model;

public class HabitacionDoble extends Habitacion {

	public HabitacionDoble() {
		super();
	}
	
	public HabitacionDoble(String n, double pB, int cM) {
		super(n, pB, cM);
	}
	
	public double calcularPrecio(int noches) {
		return noches;
	}

}
