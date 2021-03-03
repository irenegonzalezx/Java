package practica;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe el número:");
		int numero = scan.nextInt();
		
		if (numero < 0)
		{
			System.out.println(numero + " es negativo.");
		}
		
		if (numero == 0)
		{
			System.out.println(numero + " es neutro.");	
		}
		
		else {
			System.out.println(numero + " es positivo.");	
		}
			
		
		scan.close();
	}

}
