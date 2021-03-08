package practica5;

public class Figura {

	private String tipo;
	private double lado1;
	private double lado2;
	
	Figura() {
		
	}

	Figura(double valor1, double valor2) {

		setLado1(valor1);
		setLado2(valor2);
	}
	
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {

		if (lado1 > 100) {

			this.lado1 = 100;

		} else if (lado1 <= 0) {

			this.lado1 = 0;
		} else {

			this.lado1 = lado1;
		}

	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 > 100) {

			this.lado2 = 100;

		} else if (lado2 <= 0) {

			this.lado2 = 0;
		} else {

			this.lado2 = lado2;
		}

	}

	public double area() {

		return (getLado1() * getLado2());
	}

}
