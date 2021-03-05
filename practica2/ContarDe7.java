package practica2;

import java.util.Scanner;

public class ContarDe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Contar de 0 a 100 de 7 en 7.

		for (int i = 0; i <= 100; i += 7) {
			System.out.println(i + " ");
		}

		// Pedir un número y contar desde ese número hasta 100

		System.out.println("Introduzca un numero: ");
		Scanner scan = new Scanner(System.in);

		int numero;
		numero = scan.nextInt();

		for (int i = 100; i >= numero; i -= 7)
			System.out.println(i);
		
		scan.close();
	}

}
