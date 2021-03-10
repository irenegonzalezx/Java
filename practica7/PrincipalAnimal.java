package practica7;

public class PrincipalAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Objeto de la clase animal
		Animal a1 = new Animal();
		
		a1.setPatas(4);
		a1.setColor("blanco");
		System.out.println(a1.sonido());
		System.out.println(a1);
		System.out.println(a1.chip());
		
		//Objeto de la clase gato
		Gato michi = new Gato();
		System.out.println(michi.sonido());
		System.out.println(michi.chip() + ", ronronea: " + michi.isRonronear());
		
		//Objeto de la clase perro
				Perro mushu = new Perro();
				mushu.setPeligroso(true);
				System.out.println(mushu.sonido());
				System.out.println(mushu.chip() + ", potencialmente peligroso: " + mushu.isPeligroso());
				
		//Objeto de la clase perro
		Hamster billy = new Hamster();
		billy.setRaza("no tiene raza, pero es cuqui.");
		System.out.println(billy.sonido());
		System.out.println(billy.chip() + ", raza: " + billy.getRaza());
		
		//Objeto de la clase rapaces
		Rapaz aguila = new Rapaz();
		aguila.setVuela(true);
		aguila.setEvergadura(2);
		aguila.setVelocidad(104.5);
		System.out.println(aguila.sonido());
		System.out.println(aguila.chip() + ", vuela: " + aguila.isVuela() + ", envergadura: " + aguila.getEvergadura() + " metros, velocidad: " + aguila.getVelocidad() + " km/h.");
		
		//Objeto de la clase periquito
				Periquito pichí = new Periquito();
				pichí.setVuela(true);
				pichí.setCanta(true);
				System.out.println(pichí.sonido());
				System.out.println(pichí.chip() + ", vuela: " + pichí.isVuela() + ", canta: " + pichí.isCanta());
	}


	
}
