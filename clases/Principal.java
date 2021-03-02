 package clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.mostrar();
		System.out.println(p1.saludar("hola"));
		
		p1.setNombre("Irene");
		p2.setNombre("Laura");
		System.out.println(p1.getNombre() + " y " + p2.getNombre());
	}

}
