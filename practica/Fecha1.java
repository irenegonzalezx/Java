package practica;

import java.util.Scanner;

public class Fecha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe el día (del 1 al 31):");
		int dia = scan.nextInt();

		System.out.println("Escribe el mes (del 1 al 12):");
		int mes = scan.nextInt();

		System.out.println("Escribe el año:");
		int year = scan.nextInt();

	
		if (mes < 1 || mes > 12) {
			System.out.println("El mes es incorrecto.");
		}

		// Meses con 31
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia < 1 || dia > 31) {
				System.out.println("El mes es incorrecto.");
			}
		}

		// Meses con 30
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia < 1 || dia > 30) {
				System.out.println("El mes seleccionado solo tiene 30 días.");
			}
		}

		// Febrero
		if (mes == 2) {
			if (dia < 1 || dia > 28) {
				System.out.println("Incorrecto, febrero tiene 28 días.");
			}
		}

		else {
			System.out.println("La fecha " + dia + "/" + mes + "/" + year + " es correcta.");
		}
		scan.close();
	}

}
