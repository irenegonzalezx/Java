package practica8;

public class Circulo extends Figuras {

	private static final double PI = 3.1416;

	public Circulo() {
		// TODO Auto-generated constructor stub
	}

	public Circulo(double x) {
		setLadox(x);
	
	}

	@Override
	public String area() {
		// TODO Auto-generated method stub
		return "El �rea del c�rculo es: " + (PI * (getLadox() * getLadox()));
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando el c�rculo:");
		System.out.println("No se puede dibujar el c�rculo.");

	}

}
