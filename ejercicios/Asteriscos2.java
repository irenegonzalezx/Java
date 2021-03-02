package ejercicios;

public class Asteriscos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array de enteros de 10
		// Lo rellenamos con numeros del 1 al 10 aleatorios Math.random()*10+1
		// por cada numero pintamos el mismo numero de asteriscos
		// 2,3,4
		// 2 **
		// 3 **
		// 7 *******

		// Crear el array
		int array1[] = new int[10];

		// Rellenarlo con números aleatorios
		for (int x = 0; x < array1.length; x++) {
			array1[x] = (int) (Math.random() * 10 + 1); // Cast
		}

		// Por cada numero del array......
		for (int x = 0; x < array1.length; x++) {
			System.out.print("Número: " + array1[x] + " -> ");
			// Pinto astericos

			for (int asteriscos = 0; asteriscos < array1[x]; asteriscos++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

}
