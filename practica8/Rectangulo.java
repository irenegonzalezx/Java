package practica8;

public class Rectangulo extends Figuras {

	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}

	public Rectangulo(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String area() {
		// TODO Auto-generated method stub
		return "El área del rectángulo es: " + (getLadox() * getLadoy());
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
		System.out.print("Dibujando el rectángulo:");
		
	       for(int i = 0; i < getLadox(); i++){
	           
	            System.out.println(" ");
	            for(int z = 0; z < getLadoy(); z++){
	            
	                System.out.print("*");
	            
	            }
	        } 

			System.out.println();
		}

	}


