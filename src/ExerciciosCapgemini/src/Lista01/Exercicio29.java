package Lista01;

/*29. FAÇA UM ALGORITMO QUE RECEBA O NÚMERO DO MÊS E MOSTRE O MÊS CORRESPONDENTE. VALIDE MÊS INVÁLIDO;*/
import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String mes;

		System.out.println("Digite o número do mês / Enter the month number / Ingrese el número de mes");
		mes = ler.next();

		if (mes.equals("1")) {
			System.out.println("Janeiro / January / Enero");
		} else if (mes.equals("2")) {
			System.out.println("Fevereiro/ February/ Febrero");
		} else if (mes.equals("3")) {
			System.out.println("Março / March / Marzo");
		} else if (mes.equals("4")) {
			System.out.println("Abril / April / Abril");
		} else if (mes.equals("5")) {
			System.out.println("Maio / May / Mayo");
		} else if (mes.equals("6")) {
			System.out.println("Junho / June / Junio");
		} else if (mes.equals("7")) {
			System.out.println("Julho / July / Julio");
		} else if (mes.equals("8")) {
			System.out.println("Agosto / August / Agosto");
		} else if (mes.equals("9")) {
			System.out.println("Setembro / September / Septiembre");
		} else if (mes.equals("10")) {
			System.out.println("Outubro / October / Octubre");
		} else if (mes.equals("11")) {
			System.out.println("Novembro / November / Noviembre");
		} else if (mes.equals("12")) {
			System.out.println("Dezembro / December / Diciembre");
		} else {
			System.out.println("Mês inválido! / Invalid month! / !mes inválido!");
		}

	}

}
