package practica11marzo;

public class Oficial extends Operario {
	
	Oficial () {
	}
	
	Oficial (String n1) {
		setNombre(n1);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " -> Oficial";
	}

	
}
