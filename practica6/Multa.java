package practica6;

public class Multa extends Expediente {
	
	public Multa(int codexpediente, String tipo) {
		super(codexpediente, tipo);
		// TODO Auto-generated constructor stub
	}
	
	public Multa() {
		
	}
	
	private double importe;

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		if (importe < 1) {
			this.importe = 1;
		}
		else {
		this.importe = importe;
		}
	}

	@Override
	public void verdatos() {
		// TODO Auto-generated method stub
		super.verdatos();
		System.out.println("El importe de la multa del expediente " + getCodexpediente() + " es: " + getImporte());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getDescripcion() + " " + getResponsable();
	}
	
	

}
