package interfaz;

public class Camion implements InterfazVehiculo {
	
	private int peso;
	
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		int contador = 0;
		
		while (this.peso >= 100) {
			this.peso = this.peso - 100;
			contador = contador + 2;
		}
		
		return "Distancia de frenado: " + ((velocidad * velocidad) / 180) + " metros y " + contador + " metros extras por el peso.";
	}

	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		if (velocidad > VELOCIDADMAXIMA) {
			return "Vas a una velocidad de " + velocidad + " km/h y por encima de la permitida, que es ." + VELOCIDADMAXIMA + " km/h. Vas en quinta.";
		}
		
		if (velocidad > 0 && velocidad <= 20) {
			return "Una velocidad de " + velocidad + " es una velocidad adecuada. Vas en primera";

		}
		else if (velocidad > 20 && velocidad <= 40 ) {
			return "Una velocidad de " + velocidad + " es una velocidad adecuada. Vas en segunda.";
		}
		else if (velocidad > 40 && velocidad <= 60 ) {
			return "Una velocidad de " + velocidad + " es una velocidad adecuada. Vas en tercera.";
		}
		else if (velocidad > 60 && velocidad <= 80 ) {
			return "Una velocidad de " + velocidad + " es una velocidad adecuada. Vas en cuarta.";
		}
		else if (velocidad > 80 ) {
			return "Una velocidad de " + velocidad + " es una velocidad adecuada. Vas en quinta.";
	
		}
		else {
			return "Estás parado";
		}
	}
		
	

	@Override
	public double calcularprecio(int pvp) {
		// TODO Auto-generated method stub
		return (pvp * 1.10);
	}

}
