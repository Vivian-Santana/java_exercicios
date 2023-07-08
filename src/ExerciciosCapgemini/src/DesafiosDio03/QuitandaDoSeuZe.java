package DesafiosDio03;

import java.util.Scanner;

/*DESAFIO
SEU ZÉ ESTÁ VENDENDO FRUTAS COM A SEGUINTE TABELA DE PREÇOS:

EXEMPLO 1

 	ATÉ 5 KG	ACIMA DE 5 KG
MORANGO	R$ 2,50 POR KG	R$ 2,20 POR KG
MAÇÃ	R$ 1,80 POR KG	R$ 1,50 POR KG
SE O CLIENTE COMPRAR MAIS DE 8 KG EM FRUTAS OU O VALOR TOTAL DA COMPRA ULTRAPASSAR R$ 25,00, RECEBERÁ AINDA UM DESCONTO DE 10% SOBRE ESTE TOTAL. ESCREVA UM ALGORITMO PARA LER A QUANTIDADE (EM KG) DE MORANGOS E A QUANTIDADE (EM KG) DE MAÇAS ADQUIRIDAS E ESCREVA O VALOR A SER PAGO PELO CLIENTE.

ENTRADA
COMO ENTRADA, VOCÊ RECEBERA A QUANTIDADE EM KG DE MORANGOS E A QUANTIDADE EM KG DE MAÇÃS.

SAÍDA
SERÁ O VALOR A SER PAGO PELO CLIENTE, CONFORME A TABELA DE PREÇOS DA QUINTANDA DO SEU ZÉ.

EXEMPLO 1

ENTRADA	
3
SAÍDA
2	11.1
 

EXEMPLO 2

ENTRADA	
1
SAÍDA
1	4.3
 

EXEMPLO 3

ENTRADA	
5
SAÍDA
5	19.35*/
public class QuitandaDoSeuZe {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o total de morangos em kg: ");
		int morangos = input.nextInt();
		
        System.out.println("Digite o total de maças em kg: ");
        int macas = input.nextInt();
        
        System.out.println(totalPagar(morangos, macas));

        input.close();
        
	}
        public static double totalPagar(int morango, int maca) {
            double total, totalMorango, totalMaca;        
            if (morango <= 5) {
                totalMorango = morango * 2.50;
            }
            else  {
                totalMorango = morango * 2.20;
            }

            if (maca <= 5) {
                totalMaca = maca * 1.80;
            }
            else {
                totalMaca = maca * 1.50;
            }

            total = totalMaca + totalMorango;

            if (total > 25 || morango + maca > 8) {
                total -= total * 0.1;
            }
			return total;
	}
}
