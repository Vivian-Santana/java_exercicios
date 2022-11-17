package condicionais;

// MÉTODO QUE RECEBE COMO PARÂMETRO UMA STRING E RETORNA A FRASE ESPACEJADA
public class FraseSpace {

	public static void main(String[] args) {

		System.out.println(espacejando("java"));

		System.out.println(espacejando("O método é uma boa prática de programação"));

	}

	private static String espacejando(String f) {

		String aux = "";

		for (byte i = 0; i < f.length(); i++) {

			aux = aux + f.charAt(i) + " ";

		}

		return aux;

	}
}
/*
 * O PARÂMETRO PODE SER PASSADO TAMBÉM COMO UM LITERAL (“JAVA”), NÃO PRECISA SER
 * UMA VARIÁVEL, PORQUE ESTAMOS USANDO PASSAGEM DE PARÂMETRO POR VALOR, OU SEJA,
 * É FEITA UMA CÓPIA DO VALOR E COLOCADA NA VARIÁVEL QUE REPRESENTA O PARÂMETRO
 * NO CASO F.
 */