package abstractas;

public class AvionPasajeros extends Avion {
	
	private int numpasajeros;
	private int numpilotos;
	
	
	public int getNumpasajeros() {
		return numpasajeros;
	}
	public void setNumpasajeros(int numpasajeros) {
		this.numpasajeros = numpasajeros;
	}
	public int getNumpilotos() {
		return numpilotos;
	}
	public void setNumpilotos(int numpilotos) {
		this.numpilotos = numpilotos;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Es un avion modelo " + getModelo() + ", de tonelaje " + getTonelaje() + " toneladas, de potencia " + getPotencia() + ", con " + getNumpasajeros() + " pasajeros y " + getNumpilotos() + " pilotos.";
	}


	@Override
	public String repostar() {
		// TODO Auto-generated method stub
		return "Resposto en el aeropuerto y en la base.";
	}
	
	public double beneficio (double pvpbillete) {
		return(pvpbillete * getNumpasajeros());
	}
	
	@Override
	public boolean equals(Object obj) {
		AvionPasajeros ap2 = (AvionPasajeros) obj;
		
		if (this.getModelo() == ap2.getModelo() && this.getNumpasajeros() == ap2.getNumpasajeros()) {
			return true;
		}
		else {
			return false;
		}
			
	}
	
	

}
