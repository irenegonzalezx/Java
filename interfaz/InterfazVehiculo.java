package interfaz;

public interface InterfazVehiculo {
	
	int VELOCIDADMAXIMA = 120;
	String frenar(int velocidad);
	String acelerar(int velocidad);
	double calcularprecio(int pvp);

}
