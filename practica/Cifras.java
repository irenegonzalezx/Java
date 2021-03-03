package practica;

//import java.util.Locale;
import java.util.Scanner;

public class Cifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/* Scanner entrada = new
		Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH); */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe el número:");
		String cadena = scan.nextLine();
		
		double numero = Double.parseDouble(cadena);
		
		if (numero < 0 || numero > 9999)
		{
			System.out.println("Error.");
		}
		else {
		int longitud = cadena.length();
		int posicion;
		int contador = 0;
		
		for (posicion = 0; posicion < longitud; posicion ++)
		{
			if (cadena.charAt(posicion) != '.')
			{
				contador ++;
			}
		}
		
		System.out.println("El número tiene " + contador + " cifras.");
		
		}
		scan.close();
		//entrada.close();
	}

}
