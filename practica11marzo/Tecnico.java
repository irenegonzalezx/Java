package practica11marzo;

public class Tecnico extends Operario {
	
	Tecnico () {
	}
	
	Tecnico (String n1) {
		setNombre(n1);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " -> Técnico/a";
	}

	
}
