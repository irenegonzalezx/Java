package practica7;

public class Periquito extends Pajaro {

	private boolean canta;


	public boolean isCanta() {
		return canta;
	}
	public void setCanta(boolean canta) {
		this.canta = canta;
	}
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "píopío";
	}
	
	
	
}
