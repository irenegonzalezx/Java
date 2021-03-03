package clases;

public class Utilidades {
	
	public static boolean Numerosprimos(double n1)
	{

		boolean primo = true;
		
		if (n1 % 2 == 0) {
			return false;
		} else {
			// Contador
			int x = 2;

			// Comprobar si es primo
			while (x < n1) {
				if (n1 % x == 0) {
					// System.out.println("Divisible por:" + x);
					return false;
				}
				x++;
			}
			return primo;
		}
	}
	
	public static boolean ParImpar(double n2)
	{
		boolean par = true;
		
		if (n2 % 2 == 0) {
			return par;
		} else {
			return false;
		}
	}

}
