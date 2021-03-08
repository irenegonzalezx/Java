package herencia;

public class Hijo1 extends Padre {
	
	private int pagasemanal;

	public Hijo1(int cod, String dato) {
		super(cod, dato);
		// TODO Auto-generated constructor stub
	}

	public int getPagasemanal() {
		return pagasemanal;
	}

	public void setPagasemanal(int pagasemanal) {
		this.pagasemanal = pagasemanal;
	}
	
	public double pagamensual()
	{
		return(pagasemanal*4);
	}
	

}
