package practica11marzo;

public class Empleado {
	
	//Atributo nombre
	private String nombre;
	
	//Constructor por defecto
	Empleado() {
	}
	
	//Constructor con par�metros
	Empleado (String n1) {
		this.nombre = n1;
	}
	
	//Getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//M�todo toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Empleado/a: " + getNombre();
	}
	
	

}
