package condicionais;
/*EXEMPLO COM DOIS MÉTODOS, SOMAR E MULTIPLICAR, QUE RECEBEM UM VETOR DE INTEIROS E 
DEVOLVEM A SOMA E O PRODUTO DOS ELEMENTOS RESPECTIVAMENTE.*/
public class CalcVetor {

	public static void main(String[] args) {

		int[] vetor = new int[5];

		vetor[0] = 10;

		vetor[1] = 5;

		vetor[2] = 7;

		vetor[3] = 8;

		vetor[4] = 1;

		System.out.println("O soma é " + somar(vetor));

		System.out.println("O produto é " + multiplicar(vetor));

	}

	private static int somar(int[] v) {

		int aux = 0; // ELEMENTO NEUTRO DA SOMA

		for (byte i = 0; i < v.length; i++)

			aux += v[i];

		return aux;

	}

	private static int multiplicar(int[] v) {

		int aux = 1; // ELEMENTO NEUTRO DA MULTIPLICAÇÃO

		for (byte i = 0; i < v.length; i++)

			aux *= v[i];

		return aux;

	}
}
