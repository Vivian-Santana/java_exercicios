package Dio;

import java.util.Scanner;

public class OperadorXor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro:");
		int  n = sc.nextInt();
		
		if (Par(n) ^ maiorQue100(n)) { //TESTA SE APENAS UMA É VERDADEIRA, USADO QUANDO TEMOS VÁRIAS CONDIÇÕES EM SÓ UMA PODE SER VERDADEIRA.
			 System.out.println("Uma condição é verdadeira"); 
		} else if (Par(n) && maiorQue100(n)){
			 System.out.println("as duas condições são verdadeiras"); 
		} else {
			 System.out.println("nenhuma das condições são verdadeiras");
		}
	}	

	private static boolean Par(int n) {
		return n % 2 == 0;
	}

	private static boolean maiorQue100(int n) {
		return n > 100;
	}
	
}