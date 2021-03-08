package practica5;

public class PrincipalFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura f1 = new Figura();
		Figura f2 = new Figura(4,5);
		
		f1.setLado1(4);
		f1.setLado2(5);
		System.out.println(f1.area());
		System.out.println(f2.area());
	}

}
