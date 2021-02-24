package arrays;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear un array de Strings de 3x3
		// Pedir por teclado dos posiciones (x,z) 1, 2
		// Poner en "X" en esa posición
		// Pintamos el bucle
		
		// Creo el tablero
				String tablero[][] = new String[3][3];

				// Lo relleno de "-"
				for (int z = 0; z < tablero.length; z++) {
					for (int h = 0; h < tablero[z].length; h++) {
						tablero[z][h] = "-";
					}
				}
				
				// Lo pinto para comprobar
				for (int z = 0; z < tablero.length; z++) {
					for (int h = 0; h < tablero[z].length; h++) {
						System.out.print(tablero[z][h]);
					}
					System.out.println();
				}

				Scanner entrada = new Scanner(System.in);
				int fila;
				int columna;
				
				do {
					// Pido una posición para pintar una x
					System.out.println("Fila (-1 para salir):");
					fila = entrada.nextInt();
					if (fila == -1) {
						System.out.println("Terminado");
						break;
					}
					
					if (fila > 2 || fila < 0) {
						System.out.println("Solo numeros entre 0 y 2");
						continue;
					}
					System.out.println("Columna:");
					columna = entrada.nextInt();
					if (columna > 2 || columna < 0) {
						System.out.println("Solo numeros entre 0 y 2");
						continue;
					}

					// Pongo una X en esa posición
					tablero[fila][columna] = "X";

					// Pinto de nuevo el array
					for (int z = 0; z < tablero.length; z++) {
						for (int h = 0; h < tablero[z].length; h++) {
							System.out.print(tablero[z][h]);
						}
						System.out.println();
					}
				} while (true);

				entrada.close();
			}

		}