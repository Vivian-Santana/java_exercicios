package POO.SistemaFolhaDePagamento;

public class Vendedor extends Funcionario{//VENDEDOR É UMA EXTENÇÃO DE FUNCIONARIO ELE VAI HERDAR OS ATRIBUTOS E MÉTODOS DE FUNCIONARIO.

	private int totalVendas;
	private float comissaoVendas;
	
	public Vendedor (){
		super(); // SUPER () INDICA QUE ESTOU PEGANDO ATRIBUTOS OU METODOS DA CLASSE SUPERIOR. E QUE VENDEDOR É UM TIPO DE FUNCIONARIO PORTANTO TERÁ TUDO QUE FUNCIONARIO TEM.
	}

	public float calculaSalario() {
		return super.getSalario()+ (this.comissaoVendas * totalVendas);// THIS INDICA QUE ESTOU PEGANDO ATRIBUTOS DESSA CLASSE VENDEDOR EO SUPER Q EU ESTOU PEGANDO O "GET SALARIO" DA CLASSE FUNCIONARIO.
	}

	public int getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}

	public float getComissaoVendas() {
		return comissaoVendas;
	}

	public void setComissaoVendas(float comissaoVendas) {
		this.comissaoVendas = comissaoVendas;
	}
	
}
