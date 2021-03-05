package practica2;

import java.util.Scanner;

public class AdivinarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);

	int aleatorio = (int) (Math.random() * 100) + 1;
	int numero = 0;
	
	
	do {
		System.out.println("Tienes que adivinar un número entre 1 y 100. Empieza a escribir opciones:");
		numero = scan.nextInt();
		
		if (numero > aleatorio)
		{
			System.out.println("El número que buscas es menor.");
		}
		
		else if (numero < aleatorio)
		{
			System.out.println("El número que buscas es mayor.");
		}
	
	} while (aleatorio != numero);
	
	System.out.println("¡Bien! Has acertado.");
	scan.close();
	
}
}