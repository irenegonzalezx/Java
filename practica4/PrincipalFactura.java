package practica4;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factura f1 = new Factura();

		System.out.println("Alta de la factura:");

		f1.altafactura();

		// Introducir cod_factura, cod_cliente, o unidad
		f1.modfactura("unidad", 10);

		// Para double
		f1.modfactura1("precio", 0.50);

		// Para string
		f1.modfactura2("nombreproducto", "Pan integral");

		// Para boolean
		f1.modfactura3("descuento", true);
		f1.verfactura();
	}

}
