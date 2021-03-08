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
		
		scan.close();

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

		for (int i = 0; i < tabla3.length; i++) {
			System.out.print(tabla3[i] + " ");

		}

	}

	public void tabla10por10() {

		int[][] tabla = new int[10][10];

		System.out.println("La tabla es:");

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = (int) (Math.random() * 9) + 1;
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		int sumfila = 0;
		int sumfilatotal = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				sumfila = sumfila + tabla[i][j];
				sumfilatotal = sumfilatotal + tabla[i][j];
			}
			System.out.println("La suma de la fila " + (i + 1) + " es: " + sumfila);
			sumfila = 0;
	
		}
		System.out.println();
		System.out.println("La suma total de las filas es: " + sumfilatotal);
		System.out.println();

		int sumcolumna = 0;
		int sumcolumnatotal = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				sumcolumna = sumcolumna + tabla[j][i];
				sumcolumnatotal = sumcolumnatotal + tabla[j][i];
			}
			System.out.println("La suma de la columna " + (i + 1) + " es: " + sumcolumna);
			sumcolumna = 0;

		}
		System.out.println();
		System.out.println("La suma total de las columnas es: " + sumcolumnatotal);
		System.out.println();
		
		int sumdiagonal = 0;
		int sumdiagonalinversa = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (i == j)
				{
					sumdiagonal = sumdiagonal + tabla [i][j];
				}
				if (i + j == tabla.length - 1)
				{
					sumdiagonalinversa = sumdiagonalinversa + tabla [i][j];
				}
			}
		}
		System.out.println("La suma de la primera diagonal es: " + sumdiagonal);
		System.out.println("La suma de la diagonal inversa es: " + sumdiagonalinversa);

	}

	public void arraymayor(int num1, int num2, int num3, int num4, int num5) {
		int[] grupo = { num1, num2, num3, num4, num5 };
		int aux;

		for (int i = 0; i < grupo.length - 1; i++) {
			for (int x = i + 1; x < grupo.length; x++) {
				if (grupo[x] > grupo[i]) {
					aux = grupo[i];
					grupo[i] = grupo[x];
					grupo[x] = aux;
				}
			}
		}

		System.out.print("El mayor es: " + grupo[0]);

	}

	public void binario() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un número:");
		int numero = scan.nextInt();

		int exponente = 0;
		int resto = 0;
		double binario = 0;

		if (numero < 0 || numero > 255) {
			System.out.print("Tienes que introducir un número entre 0 y 255.");
		}

		else {
			while (numero != 0) {
				resto = numero % 2;
				binario = binario + resto * Math.pow(10, exponente);
				exponente++;
				numero = numero / 2;
			}
			System.out.printf("Número en binario: %.0f %n", binario);

		}
		scan.close();
	}

	public void grados() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Escribe la temperatura en grados Fahrenheit:");
		double gradosf = scan.nextDouble();

		double gradosc = (gradosf - 32) * 5 / 9;

		System.out.print("La temperatura en grados Celsius es: " + gradosc + " ºC.");
		scan.close();
	}
	
	public  void grados1(double gradosf) {

		double gradosc = (gradosf - 32) * 5 / 9;

		System.out.print("La temperatura en grados Celsius es: " + gradosc + " ºC.");
	
	}

	public void capicua(int num1, int num2, int num3, int num4, int num5) {
		int[] grupo = {num1, num2, num3, num4, num5};

		int contleft = 0;
		int contright = grupo.length - 1;
		boolean escapicua = true;

		while (contleft <= contright && escapicua) {
			escapicua = (grupo[contleft++] == grupo[contright--]);
		}

		if (escapicua)
			System.out.println("El array es capicúa.");
		else
			System.out.println("El array no es capicúa.");
	}
	
	public void capicua1() {
		int[] grupo = new int[5];
		
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < grupo.length; i++) {
			System.out.print("Introduce cinco números: ");
			grupo[i] = scan.nextInt();

		}
		
		scan.close();

		int contleft = 0;
		int contright = grupo.length - 1;
		boolean escapicua = true;

		while (contleft <= contright && escapicua) {
			escapicua = (grupo[contleft++] == grupo[contright--]);
		}

		if (escapicua)
			System.out.println("El array es capicúa.");
		else
			System.out.println("El array no es capicúa.");
	}

}
