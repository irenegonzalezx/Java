package arrays;

import java.util.Scanner;

public class ClaseArray2 {

	public static void main(String[] args) {
		
		String[] frases = new String[5];

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime tu nombre.");
		frases[0] = scan.nextLine();
		
		System.out.println("Dime tu primer apellido.");
		frases[1]  = scan.nextLine();
		
		System.out.println("Dime tu segundo apellido.");
		frases[2]  = scan.nextLine();
		
		for (int cont=0; cont<=2; cont++)
		{
			System.out.println(frases[cont]);
		}
		
		//otra forma
		{
			System.out.println(frases[0]+ " " + frases[1] + " " + frases[2]);
		}
		scan.close();
	}

}
