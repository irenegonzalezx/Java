package practica6;

public class Expediente {

	private int codexpediente;
	private String tipo;
	private String responsable;
	private String descripcion;

	public int getCodexpediente() {
		return codexpediente;
	}

	public void setCodexpediente(int codexpediente) {
		if (codexpediente > 1000) {
			this.codexpediente = 1000;
		} else if (codexpediente < 0) {
			this.codexpediente = 0;
		} else {
			this.codexpediente = codexpediente;
		}

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo == "A" || tipo == "B" || tipo == "C") {
			this.tipo = tipo;
		} else {
			this.tipo = "A";
		}
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void verdatos() {
		System.out.println(getCodexpediente() + " " + getTipo() + " " + getResponsable() + " " + getDescripcion());
	}

}
