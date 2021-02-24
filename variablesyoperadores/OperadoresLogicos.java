package variablesyoperadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int z = 10;
		int r = 9;
		System.out.println(z > r);
		System.out.println(z < r);

		// && --> AND
		// ! --> NOT
		// || --> OR

		int x = 90;
		System.out.println(z < r || x > r);
		System.out.println(z < r && x > r);
		System.out.println( ! (z < r && x > r) );

		//Operador ternario
		
		String cadena = z < r ? "Sí":"No"; // if (z < r) "sí" else "no".
		System.out.println(cadena);
		
		
		String numero = (z % 2 == 0) ? "Es par" : "Es impar";
		System.out.println(numero);
	}

}
