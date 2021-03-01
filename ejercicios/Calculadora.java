package ejercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, escribe el primer número:");
		int n1 = scan.nextInt();
		
		System.out.println("Por favor, escribe el segundo número:");
		int n2 = scan.nextInt();
		
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Por favor, escribe la operación (+, -, *, /)");
		String operacion = scan1.nextLine();
		
	
		switch (operacion)
		{
		case "+": System.out.println("El resultado de sumar " + n1 + " y " + n2 + " es " + (n1 + n2) + ".");
			break;
		case "-": System.out.println("El resultado de restar " + n1 + " y " + n2 + " es " + (n1 - n2) + ".");
			break;
		case "*": System.out.println("El resultado de multiplicar " + n1 + " y " + n2 + " es " + (n1 * n2) + ".");
		break;
		case "/": System.out.println("El resultado de dividir " + n1 + " y " + n2 + " es " + (n1 / n2) + ".");
		break;
		default:
			System.out.println("Has introducido una operación incorrecta.");
		}
		
		
		scan.close();
		scan1.close();
		
	
	}

}
