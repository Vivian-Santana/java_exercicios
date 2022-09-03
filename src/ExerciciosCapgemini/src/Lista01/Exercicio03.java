package Lista01;
//ESCREVA UM ALGORITMO PARA DETERMINAR O CONSUMO MÉDIO DE UM AUTOMÓVEL SENDO FORNECIDA A DISTÂNCIA
//TOTAL PERCORRIDA PELO AUTOMÓVEL E O TOTAL DE COMBUSTÍVEL GASTO;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float gastoCombustivel, mediaConsumo= 0, kmPercorridos;
		
		System.out.println("Digite a distancia percorrida em km:");
		kmPercorridos = ler.nextFloat();
		
		System.out.println("Digite o gasto total de combustível em litros:");
		gastoCombustivel = ler.nextFloat();
		
		mediaConsumo =  (kmPercorridos / gastoCombustivel);
		
		System.out.format("A média de consumo de combustível é de:" + mediaConsumo);
		
	}

}
