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

		// Probando la clase Vehículo:

		Vehiculo coche = new Vehiculo();

		coche.setRuedas(4);
		coche.setTipo(2);
		coche.setBastidor("4382-GYK");
		coche.setCaballos(200);
		coche.setPvp(15000);

		System.out.println("Datos del modelo de vehículo: ");
		System.out.println("Matrícula: " + coche.getBastidor());
		System.out.println("Modelo: " + coche.getTipo());
		System.out.println("Caballos: " + coche.getCaballos());
		System.out.println("Precio de venta al público: " + coche.getPvp() + " euros");
		System.out.println("Ruedas: " + coche.getRuedas() + " y 1 de repuesto incluida");
		System.out.println("Potencia: " + coche.verPotencia());
		System.out.println("Precio final: " + coche.precio() + " euros");

		/*
		 * Se puede crear un objeto u1, pero si en la clase se crea un método estático
		 * (public static), con poner Clase.metodo es suficiente
		 *
		 * Utilidades ut1 = new Utilidades(); System.out.println(ut1.Numerosprimos(17));
		 * System.out.println(ut1.ParImpar(4));
		 */

		System.out.println(Utilidades.ParImpar(coche.getPvp()));
		System.out.println(Utilidades.Numerosprimos(coche.getPvp()));

		// Para que no diga solo true o false, se puede hacer con un if:

		if (Utilidades.ParImpar(coche.getPvp())) {
			System.out.println("Par.");
		} else {
			System.out.println("Impar.");
		}

		if (Utilidades.Numerosprimos(coche.getPvp())) {
			System.out.println("Primo.");
		} else {
			System.out.println("No es primo.");
		}
		
		//Imprimir los datos del constructor de la clase vehículo
		Vehiculo v2 = new Vehiculo();
		v2.constructor();
		
		
		// Probar constructor con parámetros
		
		Vehiculo v3 = new Vehiculo(2);
		v3.constructor();
		
		Vehiculo v4 = new Vehiculo('A');
		v4.constructor();
		
		Vehiculo v5 = new Vehiculo(20000, "5728GDV");
		v5.constructor();
		
	}

}
