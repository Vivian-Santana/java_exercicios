package Lista01;
/*ESCREVA UM ALGORITMO QUE LEIA O NOME DE UM VENDEDOR, O SEU SALÁRIO FIXO E O TOTAL DE VENDAS EFETUADAS
POR ELE NO MÊS (EM DINHEIRO). SABENDO QUE ESTE VENDEDOR GANHA 15% DE COMISSÃO SOBRE SUAS VENDAS
EFETUADAS, INFORMAR O SEU NOME, O SALÁRIO FIXO E SALÁRIO NO FINAL DO MÊS;*/

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nomeVendedor;
		float salFixo, totalVendas, salTotal, comissao;
		
		System.out.println("Digite o nome do vendedor");
		nomeVendedor = ler.next();
		
		System.out.println("Digite o salário fixo");
		salFixo = ler.nextFloat();
		
		System.out.println("Digite o total de lucro das vendas");
		totalVendas = ler.nextFloat();
		
		comissao = (15 * totalVendas)/100;
		
		salTotal = comissao + salFixo;
		
		System.out.println("Vendedor:" + "\t" + nomeVendedor + "\n"  + "Salário mensal:" + 
		"\t" + salFixo + "\n" + "Salário com a comissão:" + "\t" + salTotal);
	}

}
