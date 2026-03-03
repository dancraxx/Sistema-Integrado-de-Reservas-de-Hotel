package model;

public abstract class Habitacion {
	
	//Constantes
	private static final String NUMERO = "001";
	private static final double PRECIOBASE = 30.0;
	private static final int CAPACIDADMAXIMA = 0;
	
	// Atributos heredativos para las clases hijas
	protected String numero;
	protected double precioBase;
	protected int capacidadMaxima;
	
	// Constructores
	
	public Habitacion() {
		this.numero = NUMERO;
		this.precioBase = PRECIOBASE;
		this.capacidadMaxima = CAPACIDADMAXIMA;
	}
	
	public Habitacion(String numero, double precioBase, int capacidadMaxima) {
		this.numero = numero;
		this.precioBase = precioBase;
		this.capacidadMaxima = capacidadMaxima;
	}


	// Getters y Setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	//Método abstracto para los hijos
	public abstract double calcularPrecio(int noches);

	// Un toString para imprimir la habitación bonito en consola
	@Override
	public String toString() {
		return "Habitación " + numero + " [Capacidad: " + capacidadMaxima + " | Precio Base: " + precioBase + "€]";
	}
}