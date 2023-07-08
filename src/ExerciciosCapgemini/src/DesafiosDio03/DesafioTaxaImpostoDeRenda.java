package DesafiosDio03;

import java.util.Scanner;

/*DESAFIO
HÁ UM PAÍS DENOMINADO LOLIPAD, TODOS OS HABITANTES FICAM FELIZES EM PAGAR SEUS IMPOSTOS, POIS SABEM QUE NELE NÃO EXISTEM POLÍTICOS CORRUPTOS E OS RECURSOS ARRECADADOS SÃO UTILIZADOS EM BENEFÍCIO DA POPULAÇÃO, SEM QUALQUER DESVIO. A MOEDA DESTE PAÍS É O LOLI, CUJO SÍMBOLO É O R$.

VOCÊ TERÁ O DESAFIO DE LER UM VALOR COM DUAS CASAS DECIMAIS, EQUIVALENTE AO SALÁRIO DE UMA PESSOA DE LOLI. EM SEGUIDA, CALCULE E MOSTRE O VALOR QUE ESTA PESSOA DEVE PAGAR DE IMPOSTO DE RENDA, SEGUNDO A TABELA ABAIXO.



LEMBRE QUE, SE O SALÁRIO FOR R$ 3002.00, A TAXA QUE INCIDE É DE 8% APENAS SOBRE R$ 1000.00, POIS A FAIXA DE SALÁRIO QUE FICA DE R$ 0.00 ATÉ R$ 2000.00 É ISENTA DE IMPOSTO DE RENDA. NO EXEMPLO FORNECIDO (ABAIXO), A TAXA É DE 8% SOBRE R$ 1000.00 + 18% SOBRE R$ 2.00, O QUE RESULTA EM R$ 80.36 NO TOTAL. O VALOR DEVE SER IMPRESSO COM DUAS CASAS DECIMAIS.

ENTRADA
A ENTRADA CONTÉM APENAS UM VALOR DE PONTO FLUTUANTE, COM DUAS CASAS DECIMAIS.

SAÍDA
IMPRIMA O TEXTO "R$" SEGUIDO DE UM ESPAÇO E DO VALOR TOTAL DEVIDO DE IMPOSTO DE RENDA, COM DUAS CASAS APÓS O PONTO. SE O VALOR DE ENTRADA FOR MENOR OU IGUAL A 2000, DEVERÁ SER IMPRESSA A MENSAGEM "ISENTO".

 
EXEMPLOS DE ENTRADA	
3002.00
EXEMPLOS DE SAÍDA
R$ 80.36

EXEMPLOS DE ENTRADA	
1701.12
EXEMPLOS DE SAÍDA
ISENTO

EXEMPLOS DE ENTRADA	
4520.00

EXEMPLOS DE SAÍDA
R$ 355.60*/
//TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
public class DesafioTaxaImpostoDeRenda {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double renda, imposto = 0;
        boolean isento = false;

        renda = sc.nextDouble();

        if (renda <= 2000) {
            isento = true;
        }
        else if (renda <= 3000) {
            imposto = (renda - 2000) * 0.08;
        }
        else if (renda <= 4500) {
            imposto = (renda - 3000) * 0.18 + 1000 * 0.08;
        }
        else {
            imposto = (renda - 4500) * 0.28 + 2000 * 0.18 - 10;
        }

        if (isento) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f", imposto);
        }

        sc.close();
    }
}
