package metodos;

public class Metodo {


	// TODO Auto-generated method stub
	// Primer metodo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = m1();
		System.out.println(x);
		m2();
		System.out.println(nombre());
		System.out.println(sumar(10, 20));
		System.out.println(inicial("ejemplo"));
		String dato = "prueba";
		System.out.println(inicial(dato));
		System.out.println(iniciales("alberto", "prueba", "ejemplo"));
		System.out.println(numeroPrimo(7));
	}

	// funcion
	public static int m1() {
		return 1;
	}

	// Prodecimiento
	public static void m2() {
		System.out.println("Esto en un metodo void");
	}

	// De cadena
	public static String nombre() {
		return "Alberto";
	}

	// Con argumentos
	public static int sumar(int num1, int num2) {
		return num1 + num2;
	}

	// inicial en mayúscula
	// Pasamos una cadena y me devuelve la primera en mayusculas
	public static char inicial(String cadena) {

		String mayus = cadena.toUpperCase();
		return mayus.charAt(0);

	}

	// Otro método para poner la inicial en mayúsculas

	public static String inicialMayus(String cadena) {

		char[] tempCharArray = cadena.toCharArray();
		tempCharArray[0] = Character.toUpperCase(tempCharArray[0]);
		cadena = String.valueOf(tempCharArray);

		return cadena;
	}

	// iniciales 3 argumentos, nombre y 2 apellidos
	// devolver iniciales A.P.A
	public static String iniciales(String n, String ap1, String ap2) {
		return n.toUpperCase().charAt(0) + ". " + ap1.toUpperCase().charAt(0) + ". " + ap2.toUpperCase().charAt(0);
	}

	public static String numeroPrimo(double n1) {
		// Comprobar que es divisible por dos
		if (n1 % 2 == 0) {
			return "Numero No Primo";
		} else {
			// Contador
			int x = 2;

			// Comprobar si es primo
			while (x < n1) {
				if (n1 % x == 0) {
					// System.out.println("Divisible por:" + x);
					return "Numero No Primo";
				}
				x++;
			}
			return "Numero Primo";
		}
	}

}
