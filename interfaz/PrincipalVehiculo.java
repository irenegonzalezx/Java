package interfaz;

public class PrincipalVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche c1 = new Coche();
		
		c1.setPotencia(200);
		c1.setRuedas(4);
		System.out.println(c1.acelerar(130));
		System.out.println(c1.frenar(70));
		System.out.println("El coche vale " + c1.calcularprecio(15000) + " euros, incluyendo IVA del 21%.");
		
		Camion ca1 = new Camion();
		ca1.setPeso(5000);
		System.out.println(ca1.acelerar(70));
		System.out.println(ca1.frenar(50));
		System.out.println("El camión vale " + ca1.calcularprecio(15000) + " euros, incluyendo IVA del 10%.");
	}

}
