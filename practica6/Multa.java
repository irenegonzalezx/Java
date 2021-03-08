package practica6;

public class Multa extends Expediente {
	
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
	
	

}
