package practica4;

import java.util.Scanner;

public class Metodosp4 {

	public void ordenararray5() {

		int[] array1 = new int[5];

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe el primer número:");
		array1[0] = scan.nextInt();

		System.out.println("Escribe el segundo número:");
		array1[1] = scan.nextInt();

		System.out.println("Escribe el tercer número:");
		array1[2] = scan.nextInt();

		System.out.println("Escribe el cuarto número:");
		array1[3] = scan.nextInt();

		System.out.println("Escribe el quinto número:");
		array1[4] = scan.nextInt();

		int numero = array1[0];

		for (int i = 1; i < array1.length; i++) {
			if (numero < array1[i]) {
				numero = array1[i];
				if (i == array1.length - 1) {
					System.out.println("Los números están ordenados de forma creciente.");
					return;
				}
			} else {
				break;
			}
		}

		numero = array1[0];

		for (int i = 1; i < array1.length; i++) {
			if (numero > array1[i]) {
				numero = array1[i];
				if (i == array1.length - 1) {
					System.out.println("Los números están ordenados de forma decreciente.");
					return;
				}
			} else {
				break;
			}
		}

		System.out.println("Los números están desordenados.");
		scan.close();
	}

	public void ordenartablade5() {
		int[] tabla1 = new int[5];
		int[] tabla2 = new int[5];
		int[] tabla3 = new int[10];
		int aux;

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
		System.out.println("La tercera tabla sin ordenar es:");

		int contador = 0;

		for (int i = 0; i < tabla1.length; i++) {

			tabla3[contador] = tabla1[i];
			tabla3[contador + 1] = tabla2[i];
			contador = contador + 2;
		}

		for (int i = 0; i < tabla3.length; i++) {

			System.out.print(tabla3[i] + " ");
		}
		

		for (int i = 0; i < tabla3.length - 1; i++) {
			for (int x = i + 1; x < tabla3.length; x++) {
				if (tabla3[x] > tabla3[i]) {
					aux = tabla3[i];
					tabla3[i] = tabla3[x];
					tabla3[x] = aux;
				}
			}
		}		
		
		System.out.println();
		System.out.println("La tercera tabla ordenada es:");

		for (int i = 0; i < tabla3.length; i++)
		{
			System.out.print(tabla3[i] + " ");
			
		}
		
	}
	
	public void tabla10por10() {
		
		int[][] tabla = new int[10][10];
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = (int) (Math.random() * 10) + 1;
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
