package practica6;

public class Multatrafico extends Multa {
	
	private String matricula;
	private String fecha;
	
	public Multatrafico() {
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
		System.out.println("Datos de la multa de tráfico: " + getMatricula() + " " + getFecha());
	}


	
	
	
}
