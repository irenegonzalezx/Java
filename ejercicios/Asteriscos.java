package ejercicios;

import java.util.Scanner;

public class Asteriscos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre:");
		String nombre = scan.nextLine();
		
		System.out.println("Escribe un caracter:");
		String caracter = scan.nextLine();
		
		int longitud = nombre.length();
		int contador = 0;
		
		System.out.println("La cadena mide " + longitud + ".");
		
		while (contador < longitud)
		{
			System.out.print(caracter);
			contador ++;
		}
		
		for (contador = 0; contador < longitud; contador++) {
			System.out.println(caracter);
		}


	}

}
