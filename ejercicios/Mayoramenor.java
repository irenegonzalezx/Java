package ejercicios;

public class Mayoramenor {

	public static void main(String[] args) {
		
		int[] array1 = { 10, 43, 1, 23, 56 };
		int aux;

		//ordenar el array
		for (int i = 0; i < array1.length - 1; i++) {
			for (int x = i + 1; x < array1.length; x++) {
				if (array1[x] > array1[i]) {
					aux = array1[i];
					array1[i] = array1[x];
					array1[x] = aux;
				}
			}
		}		
		
		
		//Pintar el array
		for (int posicion=0;posicion<array1.length;posicion++)
		{
			System.out.print(array1[posicion]+"-");
			
		}

	}

}
