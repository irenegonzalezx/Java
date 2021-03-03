package practica;

import java.util.Scanner;

public class ÁreaCirculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe el radio del círculo:");
		double radio = scan.nextDouble();
		
		double area = (3.1416 * (radio * radio));
		
		System.out.println("El área del circulo es: " + area + ".");
		
		
		
		System.out.println("Escribe el precio:");
		double precio = scan.nextDouble();
		
		double precioiva = (precio + (precio * (21.0 / 100.0)));
		
		System.out.println("El precio con IVA es: " + precioiva + ".");
		
		scan.close();
	}

}
