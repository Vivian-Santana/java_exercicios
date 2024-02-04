package ForEach;
//AULA 12B
public class ComandoForEach {
	public static void main(String[] args) {
		/* 
		 * VAMOS A UM EXEMPLO PR�TICO
		 * EU VOU CRIAR UM VETOR, CARREG�-LO J� INICIALIZADO E EM SEGUIDA VOU
		 * LER OS ELEMENTOS DO VETOR USANDO UM FOR EACH
		*/
		int[] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		// VARRENDO O VETOR SEM USO DO FOR EACH
		
		System.out.println("Varrendo o vetor sem For Each");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Nr : " + vetorNumeros[i]);
		}
		
		System.out.println();
		
		// VARRENDO O VETOR USANDO O FOR EACH
		System.out.println("Varrendo o vetor usando o For Each");
		for (int listaNumeros : vetorNumeros) { // OBJ listaNumeros INCORPORA o vetorNumeros
			System.out.println("Nr : " + listaNumeros);
		}
	}

}
