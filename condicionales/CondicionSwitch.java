package condicionales;

import java.util.Scanner;

public class CondicionSwitch {

	public static void main(String[] args) {
		
		
		Scanner cadena = new Scanner(System.in);
		
		System.out.println("Por favor, escribe una vocal en minúsculas:");
		String letra = cadena.nextLine();
		
		switch (letra)
		{
		case "a": System.out.println("Has introducido la vocal a.");
			break;
		case "e": System.out.println("Has introducido la vocal e.");
			break;
		case "i": System.out.println("Has introducido la vocal i.");
		break;
		case "o": System.out.println("Has introducido la vocal o.");
		break;
		case "u": System.out.println("Has introducido la vocal o.");
		break;
		default:
			System.out.println("Incorrecto, has introducido una consonante o una mayúscula.");
			
		cadena.close();
		}

	}
	
}
