package herencia;

public class Padre {
	
	private int cod;
	private String dato;
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	
	public Padre(int cod, String dato) {
		super();
		this.cod = cod;
		this.dato = dato;
	}
}
