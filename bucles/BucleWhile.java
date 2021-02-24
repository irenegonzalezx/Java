package bucles;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		int n1;
		int n2;
		
		Scanner numero = new Scanner(System.in);

		System.out.println("Por favor, escribe el primer número:");
		n1 = numero.nextInt();

		System.out.println("Por favor, escribe el segundo número:");
		n2 = numero.nextInt();
		
		
		while(n1 <= n2)
		{
			System.out.println(n1);
			n1 ++;
		}
		numero.close();
	}

}
