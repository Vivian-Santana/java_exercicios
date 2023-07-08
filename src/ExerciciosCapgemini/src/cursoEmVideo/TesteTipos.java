package cursoEmVideo;

public class TesteTipos {

    public static void main(String[] args) {

		/*int idade =30;
		String valor = Integer.toString(idade); //INTEGER É A CLASSE INVÓLUCRO DE STRING Q PERMITE COLOCAR O 30 DENTRO DE IDADE SEM DAR PROBLEMAS DE INCOMPATIBILIDADE ENTRE OS TIPOS INTEIRO E STRING
		System.out.println(valor);*/

		/*String valor = "30.5";
		float idade = Float.parseFloat(valor);//PARSE SIGN. CONVERTER, EU VOU FAZER COM Q UM VALOR SEJA CONVERTIDO PARA FLOAT.
		System.out.println(idade);*/

        int v1 = 7, v2 = v1 % 2, v3 = 2; // V2 É IGUAL A V1%2 (O RESTO DA DVISÃO DE 7 POR 2 QUE É = 1).
        v3 += v2; // V3 RECEBE ELE MESMO QUE É 1, MAIS 2 RESULTADO FICA 3.
        System.out.println(v1 + " " + v2 + " " + v3);
    }
}
