package abstractas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caza caza1 = new Caza();
		caza1.setModelo("F-10 Hornet");
		caza1.setMisiles(2);
		caza1.setPotencia(1000);
		caza1.setTonelaje(0);
		
		//Para mostrar el método .toString no es necesario escribirlo, solo con declarar el objeto de la clase caza.
		System.out.println(caza1);
		
		System.out.println(caza1.repostar());
		
	}

}
