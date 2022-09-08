package Lista01;

/*A CONCESSIONÁRIA DE VEÍCULOS “CARANGO” ESTÁ VENDENDO OS SEUS VEÍCULOS COM DESCONTO. FAÇA UM
ALGORITMO QUE CALCULE E EXIBA O VALOR DO DESCONTO E O VALOR A SER PAGO PELO CLIENTE. O DESCONTO DEVERÁ SER
CALCULADO SOBRE O VALOR DO VEÍCULO DE ACORDO COM O COMBUSTÍVEL (ÁLCOOL – 25%, GASOLINA – 21% OU DIESEL
–14%). COM VALOR DO VEÍCULO ZERO ENCERRA ENTRADA DE DADOS. INFORME TOTAL DE DESCONTO E TOTAL PAGO PELOS
CLIENTES*/
import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float valorVeiculo = 0, descontoA, descontoG, descontoD, valorFinalA, valorFinalG, valorFinalD;
		String combustivel, alcool = null, diesel = null, gasolina = null;
		int veiculo = 0;

		// ENTRADA
		
		System.out.println("Digite o valor do veículo:");
		valorVeiculo = ler.nextFloat();

		while (valorVeiculo != 0) {
			
			System.out.println("Digite o tipo de combustível:");
			combustivel = ler.next();
			
			// CONDIÇÕES
			if (combustivel.equalsIgnoreCase("alcool")) {
				descontoA = valorVeiculo * 0.25f;
				valorFinalA = valorVeiculo - descontoA;
				System.out.println("Valor do veículo:" + "R$" + valorFinalA + "\t" + "com desconto de:" + descontoA + "R$");
				System.out.println(".............................................................................");
			} else {
				if (combustivel.equalsIgnoreCase("gasolina")) {
					descontoG = valorVeiculo * 0.21f;
					valorFinalG = valorVeiculo - descontoG;
					System.out.println("Valor do veículo:" + "R$" + valorFinalG + "\t" + "com desconto de:" + descontoG + "R$");
					System.out.println(".............................................................................");
				} else {
					if (combustivel.equalsIgnoreCase("diesel")) {
						descontoD = valorVeiculo * 0.14f;
						valorFinalD = valorVeiculo - descontoD;
						System.out.println("Valor do veículo:" + "R$" + valorFinalD + "\t" + "com desconto de:" + descontoD + "R$");
						System.out.println(".............................................................................");
					}
				}
			}
			System.out.println("Digite o valor do veículo:"); //PARADA
			valorVeiculo = ler.nextFloat();
		}
	}

}
