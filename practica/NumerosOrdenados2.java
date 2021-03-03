package practica;

import java.util.Scanner;

public class NumerosOrdenados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe el primer número:");
		int numero1 = scan.nextInt();
		
		System.out.println("Escribe el segundo número:");
		int numero2 = scan.nextInt();
		
		System.out.println("Escribe el tercer número:");
		int numero3 = scan.nextInt();
		
		int[] array1 = {numero1, numero2, numero3};
		int aux;

		
		for (int i = 0; i < array1.length - 1; i++) {
			for (int x = i + 1; x < array1.length; x++) {
				if (array1[x] > array1[i]) {
					aux = array1[i];
					array1[i] = array1[x];
					array1[x] = aux;
				}
			}
		}		
		
		
		for (int posicion = 0; posicion < array1.length; posicion++)
		{
			System.out.print(array1[posicion] + "-");
			
		}
		
		scan.close();
	}

}
