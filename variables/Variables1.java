package variables;

public class Variables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Irene";
		String apellido1 = "González";
		String apellido2 = "Fernández";
		long salario = 2000;
		int irpf = 10;
		long impuesto = salario / irpf;
		
		System.out.println("Mi nombre es " + nombre + " " + apellido1 + " " + apellido2 + ", ganas "+ salario + " euros y tienes un IRPF de " + impuesto + " euros.");

	}

}
