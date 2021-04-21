package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LeerFichero1 {

	public LeerFichero1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//C:\\Users\\irene\\Desktop\\fichero.txt

		System.out.println("Escribe la ruta del fichero:");
		Scanner scan = new Scanner(System.in);

		String fichero = scan.nextLine();

		try {

			FileReader fr = new FileReader(fichero);

			BufferedReader br = new BufferedReader(fr);

			String linea;
			linea = br.readLine();

			while (linea != null) {
				System.out.println("Mostrando contenido del fichero:");
				System.out.println(linea);
				linea = br.readLine();
			}
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("El fichero no existe.");
		}
		scan.close();
	}

}
