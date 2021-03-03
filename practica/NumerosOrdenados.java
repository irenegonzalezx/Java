package practica;

import java.util.Scanner;

public class NumerosOrdenados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe el primer número:");
		int numero1 = scan.nextInt();
		
		System.out.println("Escribe el segundo número:");
		int numero2 = scan.nextInt();
		
		if (numero1 > numero2)
		{
			System.out.println(numero1 + " > " + numero2 + ", luego " + numero1 + " es el mayor.");
		}
		
		else if (numero1 == numero2)
		{
			System.out.println(numero1 + " = " + numero2 + ". Tu a tu rollo, pero no deberían ser iguales.");
		}
		
		else if (numero1 < numero2)
		{
			System.out.println(numero2 + " > " + numero1 + ", luego " + numero2 + " es el mayor.");
		}
		
		scan.close();
	}

}
