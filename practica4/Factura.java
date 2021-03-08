package practica4;

import java.util.Scanner;

public class Factura {

	private int cod_factura;
	private int unidad;
	private double precio;
	private int cod_cliente;
	private String nombreproducto;
	private boolean descuento;

	public int getCod_factura() {
		return cod_factura;
	}

	public void setCod_factura(int cod_factura) {
		this.cod_factura = cod_factura;
	}

	public int getUnidad() {
		return unidad;
	}

	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public String getNombreproducto() {
		return nombreproducto;
	}

	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

	public void altafactura() {
		System.out.println("Alta de la factura:");

		Scanner scan = new Scanner(System.in);

		System.out.println("Código de la factura:");
		cod_factura = scan.nextInt();

		System.out.println("Código del cliente:");
		cod_cliente = scan.nextInt();

		System.out.println("Nombre del producto:");
		nombreproducto = scan.next();

		System.out.println("Precio:");
		precio = scan.nextDouble();

		System.out.println("Unidades:");
		unidad = scan.nextInt();

		String haydescuento;
		do {
			System.out.println("Descuento (Y/N):");
			haydescuento = scan.next().toUpperCase();
		} while (!haydescuento.equals("Y") && !haydescuento.equals("N"));

		descuento = haydescuento.equals("Y");
		scan.close();
	}

	public void modfactura(String campo, int valor) {

		switch (campo) {
		case "cod_factura":
			cod_factura = valor;
			break;
		case "cod_cliente":
			cod_cliente = valor;
			break;
		case "unidad":
			unidad = valor;
			break;
		}

	}

	public void modfactura1(String campo, double valor) {

		switch (campo) {
		case "precio":
			precio = valor;
			break;

		}

	}
	
	public void modfactura2(String campo, String valor) {

		switch (campo) {
		case "nombreproducto":
			nombreproducto = valor;
			break;

		}

	}
	
	public void modfactura3(String campo, boolean valor) {

		switch (campo) {
		case "descuento":
			descuento = valor;
			break;

		}

	}

	public void verfactura() {
		System.out.println("Datos de la factura: ");
		System.out.println("Código de la factura: " + cod_factura);
		System.out.println("Código del cliente: " + cod_cliente);
		System.out.println("Nombre del producto: " + nombreproducto);
		System.out.println("Precio: " + precio + " euros");
		System.out.println("Unidades " + unidad);
		System.out.println("Descuento: " + descuento);
	}

}
