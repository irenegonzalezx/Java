package practica11marzo;

public class Directivo extends Empleado {
	
	Directivo () {
	}
	
	Directivo (String n1) {
		setNombre(n1);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " -> Directivo/a";
	}
	
	

}
