package practica8;

public abstract class Figuras {
	
	private double ladox;
	private double ladoy;
	
	Figuras() {
		
	}
	
	Figuras(double x, double y) {
		this.setLadox(x);
		this.setLadoy(y);
	}
	
	Figuras(double x) {
		this.setLadox(2);
	}
	
	public double getLadox() {
		return ladox;
	}
	public void setLadox(double ladox) {
		this.ladox = ladox;
	}
	public double getLadoy() {
		return ladoy;
	}
	public void setLadoy(double ladoy) {
		this.ladoy = ladoy;
	}
	
	public abstract String area();
	public abstract void dibujar();
	
	
}
