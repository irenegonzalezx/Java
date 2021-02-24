package bucles;

public class BuclesEtiquetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		
		//Bucle principal
principal:		while (b)
		{
			System.out.println("Estoy en el bucle principal.");
				
			//Bucle secundario
secundario:		for (int x = 0; x <= 10; x ++)
				{
					System.out.println("Estoy en el bucle secundario." + x);
					if (x == 5)	
					break principal;
				}
		}
	}

}
