package practica7;

public class Gato extends Animal{
	
	private boolean ronronear;
	
	public boolean isRonronear() {
		return ronronear;
	}
	public void setRonronear(boolean ronronear) {
		this.ronronear = ronronear;
	}

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Miau";
	}
	
}
