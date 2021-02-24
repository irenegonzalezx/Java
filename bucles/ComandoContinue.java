package bucles;

public class ComandoContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		while (x < 10) {
			x ++;
			if (x==6) {
				continue;
				}
			System.out.println("He pasado por la iteración:" + x);
		}
	}

}
