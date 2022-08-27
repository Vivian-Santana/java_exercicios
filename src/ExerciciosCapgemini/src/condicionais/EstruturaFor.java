package condicionais;

import java.util.Scanner;

//15. FAÇA UM ALGORITMO QUE RECEBA UM NÚMERO E DIGA SE ESTE NÚMERO ESTÁ NO INTERVALO ENTRE 100 E 200;
public class EstruturaFor {

	public static void main(String[] args) {
		
		int num;
		
		Scanner lerScanner = new Scanner (System.in);
		
		System.out.println("Digite um número");
		
		num = lerScanner.nextInt();
		
		if (num >= 100 && num <=200){
			System.out.println("O número está no intervalo");
			
		}else {
			System.out.println("O número está fora do intervalo");
		}

	}

}
