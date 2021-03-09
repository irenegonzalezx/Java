package practica7;

public class Animal {
	
	private int patas;
	private String color;
	
	
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String sonido() {
		return "Sonido del animal";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Es un animal de color " + getColor() + " y tiene " + getPatas() + " patas.";
	}
	
	
}
