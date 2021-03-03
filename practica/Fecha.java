package practica;

import java.util.Scanner;

public class Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe el día (del 1 al 31):");
		int dia = scan.nextInt();

		System.out.println("Escribe el mes (del 1 al 12):");
		int mes = scan.nextInt();

		System.out.println("Escribe el año:");
		int year = scan.nextInt();

		if (dia < 1 || dia > 31) {
			System.out.println("El día es incorrecto.");
		} else if (mes < 1 || mes > 12) {
			System.out.println("El mes es incorrecto.");
		}

		else {
			System.out.println("La fecha " + dia + "/" + mes + "/" + year + " es correcta.");
		}
		scan.close();
	}

}
