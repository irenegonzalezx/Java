package practica9;

import java.util.Scanner;

public class AdivinarNumero extends Saludar implements InterfazJuego, Ficheros {

	private int numero;
	private int numintento;
	private int tiradas;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public AdivinarNumero() {
		// TODO Auto-generated constructor stub
	}

	public int getNumintento() {
		return numintento;
	}

	public void setNumintento(int numintento) {
		this.numintento = numintento;
	}

	public int getTiradas() {
		return tiradas;
	}

	public void setTiradas(int tiradas) {
		this.tiradas = tiradas;
	}

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		System.out.println("JUEGO DE ADIVINAR NÚMERO:");
		setNumero((int) (Math.random() * 100) + 1);
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		do {
			tiradas = tiradas + 1;
			System.out.println("Escribe el número:");
			setNumintento(scan.nextInt());

			if (getNumero() == getNumintento()) {
				System.out.println("¡Has acertado!");
			}

			else if (getNumero() < getNumintento()) {
				System.out.println("El número es menor.");
			}

			else {
				System.out.println("El número es menor.");
			}
		} while (getNumero() != getNumintento());


	}

	@Override
	public void finalizar() {
		// TODO Auto-generated method stub
		System.out.println("Encontraste el número " + getNumero() + " después de " + getTiradas() + " intentos.");
		System.out.println("FIN DEL JUEGO");
	}

	@Override
	public void escribirresultado() {
		// TODO Auto-generated method stub
		System.out.println("He escrito el resultado en un fichero.");
		System.out.println();
	}

}
