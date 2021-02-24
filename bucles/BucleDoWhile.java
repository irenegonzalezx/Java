package bucles;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1;

		Scanner numero = new Scanner(System.in);

		System.out.println("Por favor, escribe un número:");
		n1 = numero.nextInt();

		do {
			System.out.println(n1);
			n1--;
		} while (n1 >= 0);

		numero.close();
	}

}
