package practica2;

import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		double numero;
		double suma = 0;
		double contador = 0;
		boolean juego = true;
		

		do {
			System.out.println("Escribe un n�mero:");

			numero = scan.nextInt();

			if (numero != 0) {
				suma = suma + numero;
				contador ++;
			}

			else {
				juego = false;
			}

		} while (juego);
		System.out.println("Has escrito " + contador + " n�meros.");
		System.out.println("La suma de los n�meros es: " + suma);
		System.out.println("La media de los n�meros es: " + (suma/contador));
		scan.close();
	}

}
