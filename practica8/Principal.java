package practica8;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("RECT�NGULO:");
		Rectangulo r1 = new Rectangulo(2,4);
		System.out.println(r1.area());
		r1.dibujar();
		System.out.println();
		
		System.out.println("L�NEA:");
		Linea l1 = new Linea(6);
		System.out.println(l1.area());
		l1.dibujar();
		System.out.println();
		
		
		System.out.println("C�RCULO:");
		Circulo c1 = new Circulo(5);
		System.out.println(c1.area());
		c1.dibujar();
		
	}

}
