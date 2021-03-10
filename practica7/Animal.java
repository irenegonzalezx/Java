package practica7;

public class Animal {
	
	private int patas;
	private String color;
	private boolean castrado;
	private char sexo;
	
	
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
	public boolean isCastrado() {
		return castrado;
	}
	public void setCastrado(boolean castrado) {
	
		this.castrado = castrado;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		if (sexo != 'H' || sexo != 'M')
		{
			this.sexo = 'M';
		}this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Es un animal de color " + getColor() + " y tiene " + getPatas() + " patas.";
	}
	
	public String chip() {
		return ("Código-AA-" + Math.random()*5000 + 1);
	}
	
}
