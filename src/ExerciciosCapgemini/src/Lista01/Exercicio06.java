package Lista01;
/*6. LEIA DOIS VALORES PARA AS VARIÁVEIS "A" E "B", E EFETUAR AS TROCAS DOS VALORES DE FORMA QUE A VARIÁVEL "A" PASSE A
POSSUIR O VALOR DA VARIÁVEL "B" E A VARIÁVEL "B" PASSE A POSSUIR O VALOR DA VARIÁVEL "A". APRESENTAR OS VALORES TROCADOS; */

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, varAuxiliar = 0;
		
		System.out.println("Digite um valor para a variável 'A':");
		a = ler.nextInt();
		
		System.out.println("Digite um valor para a variável 'B':");
		b = ler.nextInt();
		
		varAuxiliar = a; //	TIRO O VALOR DE 'A' E COLOCO NA 'VARAUXILIAR'.
		
		a = b; //COM VARIÁVEL 'A' VAZIA COLOCO O VALOR DE 'B' NELA,
		
		b = varAuxiliar;//ATRIBUO VARAUXLIAR Q TEM O VAOR DE 'A' DENTRO DELA, A VARIAVEL 'B'
		
		
		System.out.println("Agora o valor da variável 'A' é: " + a + "\n" + "E o valor da variável 'B' é:" + b);
	}

}
