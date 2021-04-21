package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirTeclado1 {

	public EscribirTeclado1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// C:\\Users\\irene\\Desktop\\fichero.txt

		System.out.println("Escribe la ruta del fichero:");
		Scanner scan = new Scanner(System.in);

		String fichero = scan.next();

		boolean juego = true;

		try {
			FileWriter f1 = new FileWriter(fichero);
			PrintWriter pw1 = new PrintWriter(fichero);
			String linea;
			int contlinea = 0;

			do {

				System.out.println("Escribe una línea:");
				linea = scan.next();

				if (linea.equals("F")) {
					juego = false;
				}
				
				else if (linea.length() > 4 && juego) {
					pw1.println(linea);
					contlinea = contlinea + 1;
				}
				
				else {
					System.out.println("Línea incorrecta.");
				}

			} while (juego);

			pw1.close();
			f1.close();
			scan.close();
			System.out.println("Has escrito " + contlinea + " líneas correctas.");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No se encuentra el fichero.");
		}

		System.out.println("Escritura terminada.");
	}

}
