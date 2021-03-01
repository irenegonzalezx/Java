package ejercicios;

import java.util.Scanner;

public class Tragaperras1 {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in);
		int[] jackpot = new int[3];
		Boolean playAgain;
		String opcion;

		do {

			// Generamos los numeros aleatorios
			double num1 = Math.random() * 3;
			double num2 = Math.random() * 3;
			double num3 = Math.random() * 3;
			// Hacemos la conversion a enteros
			jackpot[0] = (int) num1;
			jackpot[1] = (int) num2;
			jackpot[2] = (int) num3;

			// Pintamos el Array de numeros y comprobamos cuales
			// salieron para dibujar los signos correspondientes
			for (int i = 0; i < 3; i++) {

				if (jackpot[i] == 0) {

					System.out.print("*");

				} else if (jackpot[i] == 1) {

					System.out.print("x");

				} else if (jackpot[i] == 2) {

					System.out.print("o");
				}

			}

			// Comprobamos los numeros que salieron y mostramos premios
			if (jackpot[0] == jackpot[1] && jackpot[0] == jackpot[2]) {

				System.out.println("    Premio GORDO!!!");

			} else if (jackpot[0] == jackpot[1] || jackpot[0] == jackpot[2] || jackpot[1] == jackpot[2]
					|| jackpot[2] == jackpot[1]) {

				System.out.println("    Premio MEDIO!!!");
			} else {

				System.out.println("    No ganaste nada.");

			}
			// preguntamos si volvemos a jugar
			System.out.println("¿Quieres jugar de nuevo? s/n");
			opcion = consola.nextLine();
			if (opcion.equals("s")) {

				playAgain = true;
			} else {

				playAgain = false;
			}

		} while (playAgain == true);

		System.out.println("Juego terminado.");
	}
}
