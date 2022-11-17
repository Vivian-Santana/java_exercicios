package condicionais;

public class UmTerco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num;

		for (num = 1; num < 10; num++) {

			System.out.println("Um terço de " + num + " é " + terco(num));

		}
		System.out.println("*** FIM ***");
	}
	// MÉTODO AUXILIAR TERCO (CALCULA UM TERÇO DE UM PARAMETRO DOUBLE)

	private static double terco(double n) {

		return n / 3;

	}

}
