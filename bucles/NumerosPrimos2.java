package bucles;

import java.util.Scanner;

public class NumerosPrimos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8 (1 8) 2-7 8/2-->0 5
		Scanner numero = new Scanner(System.in);
		int n1;
		n1 = numero.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("El número no es primo.");
		} else {
			// Contador
			int x = 2;
			// Switch
			boolean primo = true;

			// Comprobar si es primo
			while (x < n1) {
				if (n1 % x == 0) {
					System.out.println("El número no es primo.");
					System.out.println("Es divisible por: " + x);
					primo = false;
					break;
				}
				x++;
			}
			if (primo) {
				System.out.println("El número es primo.");
			}
		}
		numero.close();
	}

}

