package abstractas;

public class Caza extends Avion {

	private String modelo;
	private int misiles;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getMisiles() {
		return misiles;
	}
	public void setMisiles(int misiles) {
		this.misiles = misiles;
	}
	
	public String disparar() {
		return "Disparando: " + getMisiles() + " misiles.";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Es un caza modelo " + getModelo() + ", con una potencia de fuego de " + getPotencia() + " y " + getMisiles() + " misiles.";
	}
	
	@Override
	public String repostar() {
		// TODO Auto-generated method stub
		return "Reposto en tierra y en vuelo.";
	}
	
	
	
}
