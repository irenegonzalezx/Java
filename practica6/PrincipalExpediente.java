package practica6;

public class PrincipalExpediente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Expediente e1 = new Expediente();
		
		e1.setCodexpediente(2000);
		e1.setDescripcion("Irene");
		e1.setTipo("D");
		e1.setResponsable("Juanito");
		e1.verdatos();
		
		Multa m1 = new Multa();
		m1.setCodexpediente(500);
		m1.setImporte(3000);
		System.out.println(m1.getImporte());
		m1.verdatos();
	}
	

}
