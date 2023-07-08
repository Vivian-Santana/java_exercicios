package DesafiosDio03;
/*DESAFIO
LEIA 3 VALORES REAIS (A, B E C) E VERIFIQUE SE ELES FORMAM OU NÃO UM TRIÂNGULO. EM CASO POSITIVO, CALCULE O PERÍMETRO DO TRIÂNGULO (SOMA DE TODOS OS LADOS) E APRESENTE A MENSAGEM:

PERIMETRO = XX.X

EM CASO NEGATIVO, CALCULE A ÁREA DO TRAPÉZIO QUE TEM A E B COMO BASE E C COMO ALTURA, MOSTRANDO A MENSAGEM:

AREA = XX.X

FÓRMULA DA ÁREA DE UM TRAPÉZIO: AREA = ((A + B) X C) / 2

ENTRADA
A ENTRADA CONTÉM TRÊS VALORES REAIS.

SAÍDA
O RESULTADO DEVE SER APRESENTADO COM UMA CASA DECIMAL.
 
EXEMPLO DE ENTRADA:
6.0 4.0 2.0
EXEMPLO DE SAÍDA:
AREA = 10.0

EXEMPLO DE ENTRADA:
6.0 4.0 2.1
EXEMPLO DE SAÍDA:
PERIMETRO = 12.1
*/
//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.
import java.util.Scanner;

public class DesafioDoTriangulo {
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a, b, c, soma;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		if (a + b > c && a + c > b && b + c > a) {
			soma = a + b + c;
			System.out.println("Perimetro = " + soma);
		} else {
			soma = (a + b) * c / 2;
			System.out.println("Area = " + soma);
		}
	}
}
