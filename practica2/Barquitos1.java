package practica2;

import java.util.Scanner;

public class Barquitos1 {

	public static void main(String[] args) {
		

		       char[] barco = new char[10];

		       int posicionBarco = (int)(Math.random()*8);
		       Scanner consola = new Scanner(System.in);
		       int numero = 0;
		       barco[posicionBarco] = 'x';
		       barco[posicionBarco+1] = 'x';
		       barco[posicionBarco+2] = 'x'; 
		       boolean hundido = false;

		       do{

		           System.out.println("Introduce numero:");
		           numero = consola.nextInt();

		           if(barco[numero] != 'x' ){

		               System.out.println("No has acertado. DISPARA DE NUEVO!");
		           } else {

		               System.out.println("Acertaste!!");
		               hundido = true;
		           }

		       }while(!hundido);
		   }
	}


