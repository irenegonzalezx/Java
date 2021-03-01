package ejercicios;

import java.util.Scanner;

public class Calculadora1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nombre = new Scanner(System.in);



		boolean juego = true;

		do {
			System.out.println("Escribe la operación (+, -, / y *):");
			String operacion = nombre.next();

			if (operacion.equals("f")) {
				juego = false;
				System.out.println("F en el chat. Game over.");
			
			}

			else if ((!operacion.equals("+") && !operacion.equals("-")  && !operacion.equals("/")  && !operacion.equals("*")
)) {
				System.out.println("Operación incorrecta, introduce +, -, / o *.");
			} else {

				System.out.println("Escribe el primer número:");
				int num1 = nombre.nextInt();
				System.out.println("Escribe el segundo número número:");
				int num2 = nombre.nextInt();

				switch (operacion) {
				case "+":
					System.out.println("La suma de " + num1 + " y " + num2 + " es " + (num1 + num2));
					break;
				case "-":
					System.out.println("La resta de " + num1 + " y " + num2 + " es " + (num1 - num2));
					break;
				case "/":
					System.out.println("La división de " + num1 + " y " + num2 + " es " + (num1 / num2));
					break;
				case "*":
					System.out.println("La multiplicación  de " + num1 + " y " + num2 + " es " + (num1 * num2));
					break;
				}

			}
		} while (juego);
		nombre.close();
	}

}