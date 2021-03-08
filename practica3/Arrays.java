package practica3;

import java.util.Scanner;

public class Arrays {

	public void mediaarrays() {

		double[] array1 = new double[5];

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe el primer número:");
		array1[0] = scan.nextDouble();

		System.out.println("Escribe el segundo número:");
		array1[1] = scan.nextDouble();

		System.out.println("Escribe el tercer número:");
		array1[2] = scan.nextDouble();

		System.out.println("Escribe el cuarto número:");
		array1[3] = scan.nextDouble();

		System.out.println("Escribe el quinto número:");
		array1[4] = scan.nextDouble();

		double ceros = 0, positivos = 0, negativos = 0;
		double sumapositivos = 0, sumanegativos = 0;

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 0) {
				ceros++;

			} else if (array1[i] > 0) {
				sumapositivos = sumapositivos + array1[i];
				positivos++;
			}

			else if (array1[i] < 0) {
				sumanegativos = sumanegativos + array1[i];
				negativos++;
			}
		}

		System.out.println("La media de los positivos es " + (sumapositivos / positivos));
		System.out.println("La media de los negativos es " + (sumanegativos / negativos));
		System.out.println("El número de ceros es " + ceros);

		scan.close();
	}

	public void tablas() {

		int[] tabla1 = new int[10];
		int[] tabla2 = new int[10];

		System.out.println("La primera tabla es:");

		for (int i = 0; i < tabla1.length; i++) {

			tabla1[i] = (int) (Math.random() * 10) + 1;

			System.out.print(tabla1[i] + " ");
		}

		System.out.println();
		System.out.println("La segunda tabla es:");

		for (int i = 0; i < tabla1.length; i++) {

			tabla2[i] = (int) (Math.random() * 10) + 1;

			System.out.print(tabla2[i] + " ");
		}

		System.out.println();
		System.out.println("La tercera tabla es:");

		for (int i = 0; i < tabla1.length; i++) {

			System.out.print(tabla1[i] + " " + tabla2[i] + " ");
		}
	}

	public void tablas1() {

		int[] tabla1 = new int[10];
		int[] tabla2 = new int[10];
		int[] tabla3 = new int[20];

		System.out.println("La primera tabla es:");

		for (int i = 0; i < tabla1.length; i++) {

			tabla1[i] = (int) (Math.random() * 10) + 1;

			System.out.print(tabla1[i] + " ");
		}

		System.out.println();
		System.out.println("La segunda tabla es:");

		for (int i = 0; i < tabla1.length; i++) {

			tabla2[i] = (int) (Math.random() * 10) + 1;

			System.out.print(tabla2[i] + " ");
		}

		System.out.println();
		System.out.println("La tercera tabla es:");

		int contador = 0;

		for (int i = 0; i < tabla1.length; i++) {

			tabla3[contador] = tabla1[i];
			tabla3[contador + 1] = tabla2[i];
			contador = contador + 2;
		}

		for (int i = 0; i < tabla3.length; i++) {

			System.out.print(tabla3[i] + " ");
		}
	}

	public void tabla5por5() {

		int[][] tabla = new int[5][5];

		// Poner la suma en cada celda del array
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				tabla[i][j] = i + j;
			}
		}

		// Visualizar el array
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void tabla7por7() {
		int[][] tabla = new int[7][7];

		// Poner la suma en cada celda del array
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				if (tabla[i][i] == tabla[j][j]) {
					tabla[i][j] = 1;
				}

				else {
					tabla[i][j] = 0;
				}
			}
		}

		// Visualizar el array
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void rectangulo() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe el lado:");
		int z = scan.nextInt();

		System.out.println("Escribe la altura:");
		int h = scan.nextInt();

		String[][] rectangulo = new String[z][h];

		for (z = 0; z < rectangulo.length; z++) {
			for (h = 0; h < rectangulo[z].length; h++) {
				rectangulo[z][h] = "*";
			}
		}

		System.out.println("El rectángulo:");

		for (z = 0; z < rectangulo.length; z++) {
			for (h = 0; h < rectangulo[z].length; h++) {
				System.out.print(rectangulo[z][h]);
			}
			System.out.println();
		}

	}

	public void rectangulo1(int z, int h) {

		String[][] rectangulo = new String[z][h];

		for (z = 0; z < rectangulo.length; z++) {
			for (h = 0; h < rectangulo[z].length; h++) {
				rectangulo[z][h] = "*";
			}
		}

		System.out.println("El rectángulo:");

		for (z = 0; z < rectangulo.length; z++) {
			for (h = 0; h < rectangulo[z].length; h++) {
				System.out.print(rectangulo[z][h]);
			}
			System.out.println();
		}

	}

	public void cubo() {

		int[][][] matriz = new int[3][3][3];

		// rellenar con 1 lamina central
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				for (int k = 0; k < matriz[i][j].length; k++) {
					if (k == 1) {

						matriz[i][j][k] = 1;

					}
				}
			}
		}

		// mostrar por laminas
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Cara " + (i + 1) + ":");
			for (int j = 0; j < matriz[i].length; j++) {
				for (int k = 0; k < matriz[i][j].length; k++) {

					System.out.print(matriz[j][k][i]);

				}
				System.out.println();
			}
			System.out.println();
		}

	}

	public void mayor(int numero1, int numero2) {
		if (numero1 > numero2) {
			System.out.println(numero1 + " es mayor.");
		} else {
			System.out.println(numero2 + " es mayor.");
		}
	}

	public void volumencilindro(int radio, int longitud) {

		double vol = 0;

		vol = Math.PI * Math.pow(radio, 2) * longitud;
		System.out.println("El volumen es: " + vol);

	}
}
