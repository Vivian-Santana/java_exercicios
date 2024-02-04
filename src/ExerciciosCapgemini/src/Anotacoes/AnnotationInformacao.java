package Anotacoes;
//AULA 10B
class AnnotationInformacao {
	void visualizar() {
		System.out.println("Método Visualização");
	}
	
	@Deprecated
	void exibir() {
		System.out.println("Mostrando que o método exibir é deprecated.");
	}

}
