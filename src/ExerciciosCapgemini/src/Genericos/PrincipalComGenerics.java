package Genericos;

import java.util.Scanner;

public class PrincipalComGenerics {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		AeronavesComGenerics<Integer> air = new AeronavesComGenerics<>();
		System.out.println("Informe o NR de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		// ADD VÔOS
		for (int i = 0; i < nrAeronaves; i++) {
			Integer nrVoo = sc.nextInt();
			air.addVoo(nrVoo);
		}
		
		air.primeiroVoo();
		Integer x = (Integer) air.primeiroVoo();
		System.out.println("O primeiro a decolar vai ser o vôo: " + x);
		air.listaVoos();
		sc.close();
	}

}