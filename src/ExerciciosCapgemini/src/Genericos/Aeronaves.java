package Genericos;

import java.util.ArrayList;
import java.util.List;

public class Aeronaves {

	private List<Integer> listaAeronaves = new ArrayList<>();
	
	// ADICIONA O NUM DO VÔO
	public void addVoo(Integer nrVoo) {
		listaAeronaves.add(nrVoo);
	}
	
	// VERIFICA SE A LISTA ESTÁ VAZIA E RETORNA O PRIMEIRO VÔO Q ENTROU
	public Integer primeiroVoo() throws Exception {
		if (listaAeronaves.isEmpty()) {
			throw new Exception("A lista está vazia");
		}
		return listaAeronaves.get(0);
	}
	//SE A LISTA NÃO ESTIVER VAZIA FAZ UMA LISTAGEM COM OS VÔOS DENTRO DO ARRAY CRIADO
	public void listaVoos() {
		System.out.print("[");
		if (!listaAeronaves.isEmpty()) {
			System.out.print(listaAeronaves.get(0));
		}
		for (int i= 1; i < listaAeronaves.size(); i++) {
			System.out.print(" " + listaAeronaves.get(i));
		}
		System.out.print("]");
	}

}
