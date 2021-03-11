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
		System.out.println();
		
		AvionPasajeros ap1 = new AvionPasajeros();
		ap1.setModelo("Boeing-747");
		ap1.setPotencia(500);
		ap1.setTonelaje(400.5);
		ap1.setNumpasajeros(200);
		ap1.setNumpilotos(4);
		
		System.out.println(ap1);
		System.out.println(ap1.repostar());
		System.out.println("El beneficio obtenido con los billetes es: " + ap1.beneficio(99.99) + " euros.");
		System.out.println();
		
		Caza caza2 = new Caza();
		caza2.setPotencia(1000);
		
		//Para llamar al método equals de Caza
		if (caza1.equals(caza2)) {
			System.out.println("Son iguales.");
		}
		else {
			System.out.println("Son distintos.");
		}
		
		AvionPasajeros ap2 = new AvionPasajeros();
		ap2.setNumpasajeros(200);;
		ap2.setModelo("Boeing-737");
		
		if (ap1.equals(ap2)) {
			System.out.println("Son iguales.");
		}
		else {
			System.out.println("Son distintos.");
		}
		
	}

}
