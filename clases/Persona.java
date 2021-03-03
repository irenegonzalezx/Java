package clases;

public class Persona {

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getSalario() {
		return Salario;
	}

	public void setSalario(long salario) {
		Salario = salario;
	}

	// Atributos: los atributos deben ser privados y solo deben accederse desde los
	// getters y setters (Source > Generate Getters and Setters...)

	private String nombre;
	private long Salario;
	private int Edad;

	public String setNombre;

	// Métodos
	public void mostrar() {
		System.out.println("Estoy en una instancia de la clase Persona");
	}

	public String saludar(String nombre) {
		return nombre.toUpperCase();
	}

	private void metodo_privado() {
		System.out.println("Estoy en un método privado.");
	}

}
