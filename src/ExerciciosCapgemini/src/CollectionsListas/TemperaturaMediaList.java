package CollectionsListas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*FAÇA UM PROGRAMA QUE RECEBA A TEMPERATURA MÉDIA DOS 6 PRIMEIROS MESES DO ANO E ARMAZENE-AS EM UMA LISTA. 
APÓS ISTO, CALCULE A MÉDIA SEMESTRAL DAS TEMPERATURAS E MOSTRE TODAS AS TEMPERATURAS ACIMA DESTA MÉDIA, 
E EM QUE MÊS ELAS OCORRERAM (MOSTRAR O MÊS POR EXTENSO: 1 – JANEIRO, 2 – FEVEREIRO E ETC). 
*/
public class TemperaturaMediaList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite a temperatura média de janeiro:");
		float janeiro = input.nextFloat();
		System.out.println("");

		System.out.print("Digite a temperatura média de fevereiro:");
		float fevereiro = input.nextFloat();
		System.out.println("");

		System.out.print("Digite a temperatura média de março:");
		float marco = input.nextFloat();
		System.out.println("");

		System.out.print("Digite a temperatura média de abril:");
		float abril = input.nextFloat();
		System.out.println("");

		System.out.print("Digite a temperatura média de maio:");
		float maio = input.nextFloat();
		System.out.println("");

		System.out.print("Digite a temperatura média de junho:");
		float junho = input.nextFloat();

		List<Float> temperaturas = new ArrayList<Float>();
		temperaturas.add(janeiro);
		temperaturas.add(fevereiro);
		temperaturas.add(marco);
		temperaturas.add(abril);
		temperaturas.add(maio);

		System.out.println("");
		// SOMA E MEDIA DA TEMPERATURA:

		Iterator<Float> contagem = temperaturas.iterator();
		Float soma = 0f;
		while (contagem.hasNext()) {
			float next = contagem.next();
			soma += next;
		}
		System.out.println("soma das temperaturas:" + soma);

		System.out.println("");
		
		float media = soma / temperaturas.size();
		System.out.println("Média da temperatura semestral:" + media);
		
		System.out.println("");
		
		// TEMPERATURAS ACIMA DA MÉDIA:
		
		System.out.print("Temperaturas acima da média: ");
		temperaturas.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f ", t));
		
		System.out.println("");
		
		// MESES Q A TEMPERATURA FOI ACIMA DA MÉDIA:

		System.out.println("Meses que a temperatura foi acima da média:");
		for (Float temp : temperaturas) {
			if (temp > media) {
				int i = temperaturas.indexOf(temp);
				switch (i) {
				case 0:
					System.out.println((i + 1) + " - JANEIRO: " + temp);
					break;
				case 1:
					System.out.println((i + 1) + " - FEVEREIRO: " + temp);
					break;
				case 2:
					System.out.println((i+ 1) + " - MARÇO: " + temp);
					break;
				case 3:
					System.out.println((i + 1) + " - ABRIL: " + temp);
					break;
				case 4:
					System.out.println((i + 1) + " - MAIO: " + temp);
					break;
				case 5:
					System.out.println((i + 1) + " - JUNHO: " + temp);
					break;
				default:
					break;
				}
			}
		}
	}

}
