package ejercicios;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner consola = new Scanner(System.in);
		System.out.println("Introduce el texto:");
		String frase = consola.nextLine();
		
		
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
