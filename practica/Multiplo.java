package practica;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe el primer número:");
		int numero1 = scan.nextInt();
		
		System.out.println("Escribe el segundo número:");
		int numero2 = scan.nextInt();
		
		if (numero1 % numero2 == 0)
		{
			System.out.println(numero1 + " es múltiplo de " + numero2);
		}
		
		
		else {
			System.out.println(numero1 + " no es múltiplo de " + numero2);
		}
			
		
		scan.close();
	}

}
