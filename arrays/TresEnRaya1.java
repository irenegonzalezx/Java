package arrays;

import java.util.Scanner;

public class TresEnRaya1 {

    public static void main(String[] args) {
        //creo la matriz
        String x[][] = new String [3][3];

        //la relleno con O
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = "O";
            }
        }

        int n1 = 0;
        int n2 = 0;
        
        Scanner scan = new Scanner(System.in);

        //bucle del juego, si introduzo un -1 en algun indice, me salgo
        while((n1 >= 0) && (n2 >= 0)){

            //pido los 2 indices
            System.out.println("Introduce un número del 1 al 3: ");
            n1 = scan.nextInt();
            System.out.println("Introduce un número del 1 al 3: ");
            n2 = scan.nextInt();

            //espacio en blanco para que se vea mejor
            System.out.println();

            //compruebo que los indices estan dentro del rango
            if ((n1 > 0) && (n2 > 0) && (n1 < 4) && (n2 < 4)){

                //pongo la ficha X en la posicion indicada
                x[n1 - 1][n2 - 1] = "X";


                //pinto el tablero
                for (int i = 0; i < x.length; i++) {
                    for (int j = 0; j < x[i].length; j++) {
                        System.out.print(x[i][j]);
                    }
                    System.out.println();
                }
                
                //espacio en blanco para que se vea mejor
                System.out.println();

            }else {
                System.out.println("Número de casilla incorrecto.");
            }
            
        }

        scan.close();

        System.out.println("Game over.");

    }

}