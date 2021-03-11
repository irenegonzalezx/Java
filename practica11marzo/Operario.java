package practica11marzo;

public class Operario extends Empleado {

	Operario () {
	}
	
	Operario (String n1) {
		setNombre(n1);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " -> Operario/a";
	}
	
}
