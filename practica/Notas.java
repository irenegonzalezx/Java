package practica;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		boolean juego = true;

		do {

			System.out.println("Por favor, escribe una nota del 1 al 10:");
			int nota = scan.nextInt();
			
			String notacadena = ((Integer)nota).toString();

			if (notacadena.equals("F")) {
				juego = false;
				System.out.println("F en el chat. Game over.");

			}
			
			else if (nota > 10 && nota < 0) {
				juego = false;
				System.out.println("F en el chat. Game over.");
			}

			else {
				switch (nota) {
				case 1:
				case 2:
				case 3:
					System.out.println("Muy deficiente.");
					break;
				case 4:
					System.out.println("Insuficiente.");
					break;
				case 5:
					System.out.println("Suficiente.");
					break;
				case 6:
					System.out.println("Bien.");
					break;
				case 7:
				case 8:
					System.out.println("Notable.");
					break;
				case 9:
				case 10:
					System.out.println("Sobresaliente.");
					break;
				}
			}

		} while (juego);

		scan.close();
	}

}
