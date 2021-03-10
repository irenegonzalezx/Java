package practica7;

public class Perro extends Animal {

	private boolean peligroso;
	
	public boolean isPeligroso() {
		return peligroso;
	}
	public void setPeligroso(boolean peligroso) {
		this.peligroso = peligroso;
	}
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Guau";
	}
}
