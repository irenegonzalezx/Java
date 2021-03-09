package practica7;

public class PrincipalAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal perro = new Animal();
		
		perro.setPatas(4);
		perro.setColor("blanco");
		System.out.println(perro.sonido());
		System.out.println(perro);
	}


	
}
