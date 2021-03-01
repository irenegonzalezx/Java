package ejercicios;

import java.util.Scanner;

public class Alreves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1= {23,45,34,67,78};
		
		int[] array2= new int[5];
		
		//Averiguar la longitud del array1
		int longitud=array1.length-1;
		
		//Rellenar ARRAY2
		for(int x=longitud;x>=0;x--) {
			array2[x]=array1[longitud-x];
		}
		
		//Pintar ARRAY
		for (int x=0;x<=longitud;x++) {
			System.out.print(array2[x]+"-");
		}


	}

}
