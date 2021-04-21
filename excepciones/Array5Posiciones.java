package excepciones;

public class Array5Posiciones {

	public Array5Posiciones() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 20, 30, 40, 34, 57 };

		try {
			System.out.println(array1[6]);
			System.out.println(10 / 0);
		} catch (ArrayIndexOutOfBoundsException errorarray1) {
			System.out.println("Error: estás accediendo a una posición que no existe.");
		} catch (ArithmeticException errorarray2) {
			System.out.println("Error: estás dividiendo por cero.");
		} catch (Exception errorarray3) {
			System.out.println("Error desconocido: " + errorarray3.getMessage());
		}

	}
}
