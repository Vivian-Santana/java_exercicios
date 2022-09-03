package Lista01;

/*A CONCESSIONÁRIA DE VEÍCULOS “CARANGO” ESTÁ VENDENDO OS SEUS VEÍCULOS COM DESCONTO. FAÇA UM
ALGORITMO QUE CALCULE E EXIBA O VALOR DO DESCONTO E O VALOR A SER PAGO PELO CLIENTE. O DESCONTO DEVERÁ SER
CALCULADO SOBRE O VALOR DO VEÍCULO DE ACORDO COM O COMBUSTÍVEL (ÁLCOOL – 25%, GASOLINA – 21% OU DIESEL
–14%). COM VALOR DO VEÍCULO ZERO ENCERRA ENTRADA DE DADOS. INFORME TOTAL DE DESCONTO E TOTAL PAGO PELOS
CLIENTES*/
import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		float valorVeiculo = 0, descontoA, descontoG, descontoD, valorFinalA, valorFinalG, valorFinalD;
		String combustivel, alcool = null, diesel = null, gasolina = null;
		int veiculo = 0;

		// ENTRADA
		System.out.println("Digite o valor do veículo");
		valorVeiculo = ler.nextFloat();

		System.out.println("Digite o tipo de combustível");
		combustivel = ler.next();

		while (valorVeiculo != 0) {
			// CONDIÇÕES
			if (combustivel.equals("alcool")) {
				descontoA = valorVeiculo * 0.25f;
				valorFinalA = valorVeiculo - descontoA;
				System.out.println("Valor do veículo:" + valorFinalA + "\t" + "com desconto de:" + descontoA + "R$");
			} else {
				if (combustivel.equals("gasolina")) {
					descontoG = valorVeiculo * 0.21f;
					valorFinalG = valorVeiculo - descontoG;
					System.out
							.println("Valor do veículo:" + valorFinalG + "\t" + "com desconto de:" + descontoG + "R$");
				} else {
					if (combustivel.equals("diesel")) {
						descontoD = valorVeiculo * 0.14f;
						valorFinalD = valorVeiculo - descontoD;
						System.out.println(
								"Valor do veículo:" + valorFinalD + "\t" + "com desconto de:" + descontoD + "R$");
					}
				}
			}
			System.out.println("Digite o valor do veículo:");
			valorVeiculo = ler.nextFloat();
		}
	}

}
