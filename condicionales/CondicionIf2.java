package condicionales;

import java.util.Scanner;

public class CondicionIf2 {

	public static void main(String[] args) {

//Escaner para número (nextInt)

		int n1;
		int n2;
		int n3;

		Scanner numero = new Scanner(System.in);

		System.out.println("Por favor, escribe el primer número:");
		n1 = numero.nextInt();

		System.out.println("Por favor, escribe el segundo número:");
		n2 = numero.nextInt();
		
		System.out.println("Por favor, escribe el tercer número:");
		n3 = numero.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " es mayor que " + n2 + " y mayor que " + n3 + ".");
		}
		
		else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " es mayor que " + n1 + " y mayor que " + n3 + ".");
		}
		else  {
				System.out.println(n3 + " es mayor que " + n1 + " y mayor que " + n2 + ".");
			
		numero.close(); //para cerrar el escáner.
		
		}
	}

}
