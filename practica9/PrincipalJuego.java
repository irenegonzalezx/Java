package practica9;

public class PrincipalJuego {

	public PrincipalJuego() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dados d1 = new Dados();
		
		d1.iniciar();
		d1.jugar();
		d1.finalizar();
		d1.escribirresultado();
		
		AdivinarNumero an1 = new AdivinarNumero();
		
		an1.iniciar();
		an1.jugar();
		an1.finalizar();
		an1.escribirresultado();
		System.out.println(an1.mensaje("He terminado el juego."));
	}

}
