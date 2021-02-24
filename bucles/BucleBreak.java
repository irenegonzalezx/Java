package bucles;

import java.util.Scanner;

public class BucleBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;

		Scanner numero = new Scanner(System.in);

		System.out.println("Por favor, escribe un número:");
		n1 = numero.nextInt();
		System.out.println("Por favor, escribe un número:");
		n2 = numero.nextInt();

		while (n1 <= n2)
		{
			System.out.print(n1 + "-");
			n1++;
			if (n1 == 12) break;
		}
		System.out.print("Te has salido con el valor " + n1);
		numero.close();
	}

}
