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
		return "El área de una línea es: las líneas no tienen área.";
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
		int z = (int) getLadox();
		
		System.out.println("Dibujando la línea:");
		for(int i= 1; i <= z; i++) {
		    System.out.print("*");
		}
		System.out.println();
	}

}
