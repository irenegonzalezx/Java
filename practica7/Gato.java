package practica7;

public class Gato extends Animal{

	private boolean castrado;
	private char sexo;
	
	
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
	public String sonido() {
		// TODO Auto-generated method stub
		return "Miau";
	}
	
	
	
}
