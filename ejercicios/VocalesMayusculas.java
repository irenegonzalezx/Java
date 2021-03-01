package ejercicios;

import java.util.Scanner;

public class VocalesMayusculas {

	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		System.out.println("Introduce el texto:");
		String frase;
		frase = consola.nextLine().toUpperCase();
		
		
		for(int i = 0; i < frase.length(); i++) {
			
			char letra = frase.charAt(i);
			
			
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || 
					letra == 'u') {
				
				continue;
				
			}else {
				
				System.out.print(letra);
			}
			consola.close();
		}
	}

}
