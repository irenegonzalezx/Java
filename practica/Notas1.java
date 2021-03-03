package practica;

import java.util.Scanner;

public class Notas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		boolean menu = true;
		while (menu) {
			System.out.println("Escribe una nota del 1 al 10:");
			int nota = scan.nextInt();

			switch (nota) {
			case -1:
				menu = false;
				break;
			case 0:
			case 1:
			case 2:
			case 3:
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
				System.out.println("Sobresaliente.");
			case 10:
				System.out.println("Matrícula de honor.");
				break;

			default:
				System.out.println("Escribe un número correcto.");
				break;
			}

		}

		System.out.println("Adiós.");
		scan.close();
	}

}
