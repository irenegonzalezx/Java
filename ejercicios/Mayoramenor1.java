package ejercicios;

public class Mayoramenor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear y rellenar el array
		int[] array1 = { 90, 34, 51, 676, 2 };
		int[] array2 = new int[5];
		boolean[] auxiliar = new boolean[5];

		// Recorrer el array de destino
		for (int contador = 0; contador < array1.length; contador++) {
			int aux = -1;
			int pos = 0;
			// Recorrer el array origen para buscar el mayor
			for (int contador1 = 0; contador1 < array1.length; contador1++) {
				// ¿Esa posicion ya ha sido eliminada?
				if (!auxiliar[contador1])
					if (array1[contador1] > aux) {
						aux = array1[contador1];
						pos = contador1;
					}

			}
			array2[contador] = aux;
			auxiliar[pos] = true;
			// Fin del bucle anidado
		}
		// Fin del bucle principal

		// Comprobar el array ordenado
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
}