package practica7;

public class Rapaz extends Pajaro {
	
	private int evergadura;
	private double velocidad;
	
	public int getEvergadura() {
		return evergadura;
	}
	public void setEvergadura(int evergadura) {
		this.evergadura = evergadura;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "PIAAAAAAARGGGGG";
	}

}
