package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public LeerFichero() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fichero = new File("C:\\Users\\irene\\Desktop\\fichero.txt");
		try {
			
			//Abro el fichero para leer
			FileReader fr = new FileReader(fichero);
			
			//Buffer para ir cargando las líneas del fichero
			BufferedReader br = new BufferedReader(fr);
			
			//Leer una línea del fichero
			//Si linea == null he llegado al final del fichero
			String linea;
			linea = br.readLine();
			
			//Mientras haya líneas, es decir mientras NO sea igual a NULL
			while (linea != null)
			{
				System.out.println(linea);
				linea=br.readLine();
			}
			
			//Cierro el fichero
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No he podido abrir el fichero.");
		}
		catch (IOException e) {
			System.out.println("Error al intentar leer una línea.");
		}
		
		System.out.println("He terminado la lectura");
	}

}
