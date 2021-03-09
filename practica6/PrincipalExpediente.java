package practica6;

public class PrincipalExpediente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Expediente e1 = new Expediente();
		Multa m1 = new Multa();

		/*
		 * e1.verdatos(); m1.setCodexpediente(500); m1.setImporte(2000);
		 * System.out.println(m1.getImporte()); m1.verdatos();
		 */

		Multatrafico mt1 = new Multatrafico();
		Multacovid mc1 = new Multacovid();

		mt1.setCodexpediente(1);
		mt1.setDescripcion("Irene");
		mt1.setTipo("D");
		mt1.setResponsable("Juanito");
		// mt1.setImporte(1000);
		mt1.setMatricula("5839GYS");
		mt1.setFecha("16/03/2020");
		mt1.verdatos();

		System.out.println();

		mc1.setCodexpediente(2);
		mc1.setDescripcion("Laura");
		mc1.setTipo("B");
		mc1.setResponsable("Juanito");
		// mc1.setImporte(3000);
		mc1.setMascarilla(false);
		mc1.setFecha("16/03/2020");
		mc1.verdatos();

		System.out.println();
		System.out.println(sabertipo(mt1));
		System.out.println(sabertipo(m1));
		System.out.println(sabertipo(mc1));
		System.out.println(sabertipo(e1));

		Multa m2 = new Multa();
		Multa m3 = new Multa();

		m2.setImporte(700);
		m3.setImporte(500);

		System.out.println(importemayor(m2, m3));

		m1.setDescripcion("Laura");
		m1.setResponsable("Irene");
		System.out.println(m1);

		Multa multas[] = new Multa[5];
		for (int i = 0; i < multas.length; i++) {
			multas[i] = new Multa(i, "A");
			multas[i].setDescripcion("Conjunto de multas" + i);
			multas[i].setImporte((Math.random() * 10000) + 1);
		}
		
		System.out.println(calcularmayor(multas));

	}

	public static String sabertipo(Expediente e1) {
		if (e1 instanceof Multacovid) {
			return "Es una multa por COVID.";
		}
		if (e1 instanceof Multatrafico) {
			return "Es una multa de tráfico.";
		}
		if (e1 instanceof Multa) {
			return "Es una multa.";
		}
		if (e1 instanceof Expediente) {
			return "Es un expediente.";
		}
		return "Tipo incorrecto.";
	}

	public static String importemayor(Multa m2, Multa m3) {

		if (m2.getImporte() > m3.getImporte()) {

			return "El importe de la primera multa es mayor que el de la segunda.";

		} else if (m3.getImporte() < m2.getImporte()) {

			return "El importe de la segunda multa es mayor que el de la primera.";
		}

		else {

			return "Los dos importes son iguales";
		}

	}

	public static String conocerTipo(Object x) {
		return "Eres de tipo" + x.toString();
	}

	public static String calcularmayor(Multa[] m1) {

		double mayor = 0;
		int codigo = 0;
		for (int i = 0; i < m1.length; i++) {
			if (m1[i].getImporte() > mayor) {
				mayor = m1[i].getImporte();
				codigo = m1[i].getCodexpediente();
			}
		}
		return mayor + " " + codigo;

	}

}
