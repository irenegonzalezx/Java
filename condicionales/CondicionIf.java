package condicionales;

import java.util.Scanner;

public class CondicionIf {

	public static void main(String[] args) {
		
		/*if (condicion)
			comando1;
		
		 *if (condicion)
		 * 
		 *	{
		 *
		 *		s1;
		 *		s2;
		 *		s3;
		 *
		 *	}
		 * 
		 * else if (condicion)
		 * 
		 *	{
		 *
		 *		s1;
		 *		s2;
		 *		s3;
		 *
		 *	}
		 *
		 *else
		 * 
		 *	{
		 *
		 *		s1;
		 *		s2;
		 *		s3;
		 *
		 *	}
		 */

		int num1 = 10;
		
		if (num1 % 2 == 0)
		{
			System.out.println(num1 + " es un número par.");
		}
		else
		{
			System.out.println(num1 + " es un número impar.");
		}
			
		/* Pedir una cadena por teclado:
		 */
		
		System.out.println("Por favor, escribe tu nombre:");
		
		Scanner nombre = new Scanner(System.in);
		String cadena = nombre.nextLine();
		
		System.out.println(cadena);
		
		
	}

}
