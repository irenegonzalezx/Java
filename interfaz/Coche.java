package interfaz;

public class Coche implements InterfazVehiculo {

	private int ruedas;
	private double potencia;
	
	
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	
	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		
		/* metros = ((velocidad * velocidad) / 180);
		 * return Double.toString(metros);
		 */
		return "Distancia de frenado: " + ((velocidad * velocidad) / 180) + " metros.";
	}

	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		if (velocidad > VELOCIDADMAXIMA) {
			return "Vas a una velocidad de " + velocidad + " km/h y por encima de la permitida, que es ." + VELOCIDADMAXIMA + " km/h.";
		}
		else {
			return "Una velocidad de " + velocidad + " es una velocidad adecuada.";
		}
	}

	@Override
	public double calcularprecio(int pvp) {
		// TODO Auto-generated method stub
		return (pvp * 1.21);
	}

}
