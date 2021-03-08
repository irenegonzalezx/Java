package herencia;

public class PrincipalPadre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Padre p1 = new Padre(1, "hola");
		System.out.println(p1.getDato() + p1.getCod());
		
		Hijo1 h1 = new Hijo1(100, "pedro");
		System.out.println(h1.getDato() + h1.getCod());
		
		h1.setPagasemanal(50);
		
		System.out.println(h1.getPagasemanal());
		System.out.println(h1.pagamensual());
	
	}

}
