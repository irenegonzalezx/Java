package practica2;

import java.util.Scanner;

public class ContadorNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int numero;
		int contador = 0;
		boolean juego = true;

		do {
			System.out.println("Escribe un número:");

			numero = scan.nextInt();

			if (numero >= 0) {
				contador++;
			}

			else {
				juego = false;
			}

		} while (juego);
		System.out.println("Has introducido " + contador + " números.");

		scan.close();
	}
}
