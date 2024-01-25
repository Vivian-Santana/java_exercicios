package Genericos;
// AULA 9B
import java.util.Scanner;

/* 
 * INFORMAR A QUANTIDADE DE AERONAVES NO PÁTIO, O NR DOS VÔOS POR ORDEM DE CHAGADA.
 * A ORDEM DE DECOLAGEM É FIFO, O PRIMEIRO QUE ENTRE É O PRIMEIRO QUE SAI.
 * MOSTRAR QUAL O PRIMEIRO VÔO A DECOLAR.
 */

public class Principal {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Aeronaves air = new Aeronaves();
		System.out.println("Informe o NR de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		// ADD VÔOS
		for (int i = 0; i < nrAeronaves; i++) {
			int nrVoo = sc.nextInt();
			air.addVoo(nrVoo);
		}
		System.out.println("O primeiro a decolar vai ser o nr: " + air.primeiroVoo());
		air.listaVoos();
		sc.close();
	}

}
