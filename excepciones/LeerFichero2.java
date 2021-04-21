package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class LeerFichero2 {

	public LeerFichero2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// C:\\Users\\irene\\Desktop\\fichero1.txt
		System.out.println("Escribe la ruta del fichero:");
		Scanner scan = new Scanner(System.in);

		String fichero = scan.nextLine();

		int contadorlinea = 0;
		int letras = 0;
		int palabras = 0;
		int palabrasporlinea = 0;
		int letrasporlinea = 0;

		try {
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);

			String linea;
			
			System.out.println();
			System.out.println("Mostrando contenido del fichero:");
			System.out.println();

			do {
				
				linea = br.readLine();
				
				if (linea == null) {
					break;
				}
			
				System.out.print("{" + linea + "}");
				System.out.print(" --> La línea " + (contadorlinea + 1) + " tiene " + linea.length() + " posiciones");
				contadorlinea++;
				letras = letras + linea.length();
				
				palabrasporlinea = 0;
				
				for (int i = 0; i < linea.length(); i++) {
					if (linea.charAt(i) == ' ') {
						palabrasporlinea++;
					}
				}
				letrasporlinea = (linea.length() - palabrasporlinea);
				System.out.println(" y " + letrasporlinea + " letras.");
				palabrasporlinea++;
				palabras = palabras + palabrasporlinea;
				
			} while (linea != null);
			
		br.close();
		fr.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Se ha producido algún error.");
		}
		System.out.println();
		System.out.println("Hay " + contadorlinea + " líneas en total.");
		System.out.println("Hay " + letras + " letras en total.");
		System.out.println("Hay " + palabras + " palabras en total.");
		
		scan.close();
	}

	// Si charAr(posicion) == " " -> se incrementa el contador de palabras.
}
