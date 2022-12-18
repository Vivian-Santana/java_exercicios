package Dio;

public class EstruturasDeControleDeFluxo1 {

	public static void main(String[] args) {
		
		meses();
		ferias();
		semana();
	}

	private static void meses() {

		int mes = 3;

		if (mes == 1) {
			System.out.println("janeiro");
		} else if (mes == 2) {
			System.out.println("fevereiro");
		} else if (mes == 3) {
			System.out.println("março");
		} else if (mes == 4) {
			System.out.println("abril");
		} else if (mes == 5) {
			System.out.println("maio");
		} else if (mes == 6) {
			System.out.println("junho");
		} else if (mes == 7) {
			System.out.println("julho");
		} else if (mes == 8) {
			System.out.println("agosto");
		} else if (mes == 9) {
			System.out.println("setembro");
		} else if (mes == 10) {
			System.out.println("outubro");
		} else if (mes == 11) {
			System.out.println("novembro");
		} else if (mes == 12) {
			System.out.println("dezembro");
		}else {
			System.out.println("mês inválido!");
		}
	}

	public static void ferias() {

		String mes = "janeiro";

		switch (mes) {
		
		case "julho":
	
		case "dezembro": 
			
		case "janeiro": 
			System.out.println("Férias!");
			break;
			
		default:
			System.out.println("Rotina normal");
			break;
		}
	}

	public static void semana() {
		String dia = "quarta";

		switch (dia) {
		case "segunda":
			System.out.println(2);
			break;
		case "terça":
			System.out.println(3);
			break;
		case "quarta":
			System.out.println(4);
			break;

		case "quinta":
			System.out.println(5);
			break;
		case "sexta":
			System.out.println(6);
			break;
		case "sabado":
			System.out.println(7);
			break;
		case "domingo":
			System.out.println(1);
			break;
			
		default:
			System.out.println("dia desconhecido, digite um dia válido!");
			break;
		}
	}

}
