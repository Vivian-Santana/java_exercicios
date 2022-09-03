package Lista01;

import java.util.Scanner;

/*8. ELABORE UM ALGORITMO QUE EFETUE A APRESENTAÇÃO DO VALOR DA CONVERSÃO EM REAL (R$) DE UM VALOR LIDO EM
DÓLAR (US$). O ALGORITMO DEVERÁ SOLICITAR O VALOR DA COTAÇÃO DO DÓLAR E TAMBÉM A QUANTIDADE DE DÓLARES
DISPONÍVEIS COM OUSUÁRIO;
*/
public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float cotacaoDolar, totalDolar, totalReais;
		
		System.out.println("Digite a cotação do dolar:");
		cotacaoDolar = ler.nextFloat();
		
		System.out.println("Digite quantos dólares você possui:");
		totalDolar = ler.nextFloat();
		
		totalReais = totalDolar * cotacaoDolar; 
		
		System.out.println("Conversão Real brasileiro:" + totalReais + "R$");

	}

}
