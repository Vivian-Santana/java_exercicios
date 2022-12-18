package Lista01;

/*29. FAÇA UM ALGORITMO QUE RECEBA O NÚMERO DO MÊS E MOSTRE O MÊS CORRESPONDENTE. VALIDE MÊS INVÁLIDO;*/
import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String mes;

		System.out.println("Digite o número do mês / Enter the month number / Ingrese el número de mes");
		mes = ler.next();

		switch (mes) {
		case "1":
			System.out.println("Janeiro / January / Enero");
			break;
		case "2":
			System.out.println("Fevereiro/ February/ Febrero");
			break;
		case "3":
			System.out.println("Março / March / Marzo");
			break;
		case "4":
			System.out.println("Abril / April / Abril");
			break;
		case "5":
			System.out.println("Maio / May / Mayo");
			break;
		case "6":
			System.out.println("Junho / June / Junio");
			break;
		case "7":
			System.out.println("Julho / July / Julio");
			break;
		case "8":
			System.out.println("Agosto / August / Agosto");
			break;
		case "9":
			System.out.println("Setembro / September / Septiembre");
			break;
		case "10":
			System.out.println("Outubro / October / Octubre");
			break;
		case "11":
			System.out.println("Novembro / November / Noviembre");
			break;
		case "12":
			System.out.println("Dezembro / December / Diciembre");
			break;
		default:
			System.out.println("Mês inválido! / Invalid month! / !mes inválido!");
			break;
		}
	}

}
