package practica2;

import java.util.Scanner;

public class ContadorNumeros1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        while(numero  >= 0) {
            System.out.println("Introduce un número: ");
            numero = scan.nextInt();

            if (numero >= 0) {
                ++contador;
            }
        }
        System.out.println("Se han introducido " + contador + " números.");
        scan.close();
	}

}
