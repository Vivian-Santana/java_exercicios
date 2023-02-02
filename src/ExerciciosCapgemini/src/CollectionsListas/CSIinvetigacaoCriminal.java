package CollectionsListas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*UTILIZANDO LISTAS, FAÇA UM PROGRAMA QUE FAÇA 5 PERGUNTAS PARA UMA
*PESSOA SOBRE UM CRIME. AS PERGUNTAS SÃO:

*"TELEFONOU PARA A VÍTIMA?"

*"ESTEVE NO LOCAL DO CRIME?"
*"MORA PERTO DA VÍTIMA?"

*"DEVIA PARA A VÍTIMA?"

*"JÁ TRABALHOU COM A VÍTIMA?"

*SE A PESSOA RESPONDER POSITIVAMENTE A 2 QUESTÕES ELA DEVE SER
*CLASSIFICADA COMO "SUSPEITA", ENTRE 3 E 4 COMO "CÚMPLICE" E 5 COMO
*"ASSASSINA". CASO CONTRÁRIO, ELA SERÁ CLASSIFICADO COMO "INOCENTE".*/

public class CSIinvetigacaoCriminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String suspeita, cumplice, culpado, inocente;
		String S = null, N = null;

		System.out.println("Telefonou para a vítima? (S = Sim , N = não)");
		String resposta1 = input.next();

		System.out.println("");

		System.out.println("Esteve no local do crime? (S = Sim , N = não)");
		String resposta2 = input.next();

		System.out.println("");

		System.out.println("Mora perto da vítima? (S = Sim , N = não)");
		String resposta3 = input.next();

		System.out.println("");

		System.out.println("Devia para a vítima? (S = Sim , N = não)");
		String resposta4 = input.next();

		System.out.println("");

		System.out.println("Já trabalhou com a vítima? (S = Sim , N = não)");
		String resposta5 = input.next();

		System.out.println("");

		List<String> respostas = new ArrayList<String>();
		respostas.add(resposta1);
		respostas.add(resposta2);
		respostas.add(resposta3);
		respostas.add(resposta4);
		respostas.add(resposta5);

		System.out.println("respostas"+ respostas);

		int contando = 0;
		
		Iterator<String> contagem = respostas.iterator();
		while (contagem.hasNext()) {
			String totalRespostas = contagem.next(); // O PRÓXIMO FICA ARMAZENADO NA VARIÁVEL NEXT.
			if (totalRespostas.contains("s")) {
				contando ++;
			}
		}

		System.out.println("");
		switch (contando) {
		case 2:
			System.out.println("Suspeita");
			break;
		case 3:
		case 4:
			System.out.println("Cúmplice");
			break;
		case 5:
			System.out.println("Assassina");
			break;
		default:
			System.out.println("Inocente");
			break;
		}
	}

}
