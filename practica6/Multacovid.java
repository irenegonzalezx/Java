package practica6;

public class Multacovid extends Multa {
	
	private boolean mascarilla;
	private String fecha;
	
	public Multacovid() {
		
	}
	
	public boolean isMascarilla() {
		return mascarilla;
	}
	public void setMascarilla(boolean mascarilla) {
		this.mascarilla = mascarilla;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public void verdatos() {
		// TODO Auto-generated method stub
		super.verdatos();
		System.out.println("Datos de la multa COVID: " + getFecha() + " " + isMascarilla());
	}
	
	
	
	
}
