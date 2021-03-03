package clases;

public class Vehiculo {

	// Declaración de atributos
	private int tipo;
	private int ruedas;
	private String bastidor;
	private int caballos;
	private double pvp;
	
	
	//Constructor para inicializar propiedades
	Vehiculo()
	{
		ruedas = 7;
		tipo = 1;
		caballos = 0;
		bastidor = "Sin bastidor";
	}
	
	//Constructor con entero
	
	Vehiculo(int r)
	{
		this.ruedas = r;
		tipo = 1;
		caballos = 0;
		bastidor = "Sin bastidor";
	} 
	
	// Constructor que recibe un char
	
	Vehiculo (char x)
	{
		if (x == 'A')
		{
			tipo = 1;
			ruedas = 2;
		}
		
		else if (x == 'B')
		{
			tipo = 2;
			ruedas = 4;
		}
		
		else if (x == 'C')
		{
			tipo = 3;
			ruedas = 8;
		}
		
		caballos = 0;
		bastidor = "Sin bastidor";
		
	}
	
	Vehiculo (int a, String b)
	{
		
		this.pvp = a;
		this.bastidor = b;
		caballos = 0;
		tipo = 0;
		ruedas = 0;
		
	}
	
	

	// Generación de getters y setters
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		if (tipo == 1 || tipo == 2 || tipo == 3) {
			System.out.println("Los datos son correctos.");
			this.tipo = tipo;

		} else {
			System.out.println("Error. Tienes que escoger un tipo del 1 al 3");
		}
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	// Para declararlo como función en vez de como propiedad, no se pone el
	// atributo, simplemente pides que te devuelva la fórmula
	public int verPotencia() {
		return (caballos * 2);
	}

	public double precio() {

		double impuestos = 0;

		if (tipo == 1)
			impuestos = 10;
		else if (tipo == 2)
			impuestos = 12;
		else if (tipo == 3)
			impuestos = 13;

		return pvp + (pvp * (impuestos / 100));

	}
	
	public void constructor()
	{
		System.out.println("Datos del constructor: " + ruedas + " " + tipo + " " + caballos + " " + bastidor + " " + pvp);
	}


}
