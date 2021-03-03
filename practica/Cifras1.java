package practica;

import java.util.Scanner;

public class Cifras1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe el número:");
		int numero = scan.nextInt();
		
		String numerocadena = ((Integer) numero).toString();
		int longitud = numerocadena.length();
		
		if (numero < 0 || numero > 9999)
		{
			System.out.println("Error.");
		}
		else {
			System.out.println("El número tiene " + longitud + " cifras.");
		}
		
		scan.close();
	}

}
