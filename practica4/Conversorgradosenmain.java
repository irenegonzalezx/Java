package practica4;

public class Conversorgradosenmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length == 1)
		
		{
			double temperatura = 0;
			try {
				temperatura = Double.parseDouble(args[10]);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(grados(temperatura));

		}
		
		else 
			System.out.println("Argumentos incorrectos");
		
		
		/* for (int x = 0; x < args.length; x++)
		{
			System.out.println(args[x]);
		}
		
		String mayor = (Integer.parseInt(args[0]) > Integer.parseInt(args[1]) ? args[0] : args[1]);
		System.out.println("El mayor es: " + mayor);
		
		Integer.parseInt("10");
		Double.parseDouble("10"); */
		
	}
	
	public static double grados(double gradosf) {

		double gradosc = (gradosf - 32) * 5 / 9;

		return gradosc;
	}

}



