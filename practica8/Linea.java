package practica8;

public class Linea extends Figuras {

	public Linea() {
		// TODO Auto-generated constructor stub
	}

	public Linea(double x) {
		setLadox(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String area() {
		// TODO Auto-generated method stub
		return "El �rea de una l�nea es: las l�neas no tienen �rea.";
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
		int z = (int) getLadox();
		
		System.out.println("Dibujando la l�nea:");
		for(int i= 1; i <= z; i++) {
		    System.out.print("*");
		}
		System.out.println();
	}

}
