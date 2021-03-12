package practica9;

import java.util.Scanner;

public class Dados implements InterfazJuego, Ficheros {
	
	private String jugador1;
	private String jugador2;
	private int tiradajugador1;
	private int tiradajugador2;
	
	
	public String getJugador1() {
		return jugador1;
	}

	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}

	public String getJugador2() {
		return jugador2;
	}

	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}

	public int getTiradajugador1() {
		return tiradajugador1;
	}

	public void setTiradajugador1(int tiradajugador1) {
		this.tiradajugador1 = tiradajugador1;
	}

	public int getTiradajugador2() {
		return tiradajugador2;
	}

	public void setTiradajugador2(int tiradajugador2) {
		this.tiradajugador2 = tiradajugador2;
	}

	
	public Dados() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("JUEGO DE DADOS:");
		System.out.println("Escribe el nombre del primer jugador:");
		setJugador1(scan.nextLine());
		
		System.out.println("Escribe el nombre del segundo jugador:");
		setJugador2(scan.nextLine());
		
	
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		
		setTiradajugador1((int) (Math.random() * 6) + 1);
		System.out.println(getJugador1() + " ha sacado el número " + getTiradajugador1() + ".");
		
		setTiradajugador2((int) (Math.random() * 6) + 1);
		System.out.println(getJugador2() + " ha sacado el número " + getTiradajugador2() + ".");
	}

	@Override
	public void finalizar() {
		// TODO Auto-generated method stub
		
		
		if (getTiradajugador1() > getTiradajugador2()) {
			System.out.println("El ganador es " + getJugador1() + ".");
		}
		else if (getTiradajugador1() < getTiradajugador2()) {
			System.out.println("El ganador es " + getJugador2() + ".");
		}
		else {
			System.out.println("Empate.");
		}
		System.out.println("FIN DEL JUEGO");
	}

	@Override
	public void escribirresultado() {
		// TODO Auto-generated method stub
		System.out.println("He escrito el resultado en un fichero.");
		System.out.println();
	}

}
