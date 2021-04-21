package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFichero {

	public EscribirFichero() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fichero = new FileWriter("C:\\Users\\irene\\Desktop\\fichero.txt");
			PrintWriter pw1 = new PrintWriter(fichero);
			
			for (int i = 0; i < 100; i++) {
				pw1.println("He escrito la línea" + i);
			}
			fichero.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
