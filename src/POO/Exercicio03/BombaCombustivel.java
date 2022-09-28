package Exercicio03;

public class BombaCombustivel {

	private String tipoCombustivel;
	private float valorLitro, quantidadeCombustivel;

	public BombaCombustivel(String tipoCombust, float valorLitro, float quantidadeCombust) {

		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.setQuantidadeCombustivel(quantidadeCombustivel);
	}

	
	public void alterarValor(float valorLitro) {  //ALTERA O VALOR DO LITRO DO COMBUSTÍVEL.
		this.valorLitro = valorLitro;
	}
	
	public void alterarCombustivel(String tipoCombustivel) { //ALTERA O TIPO DO COMBUSTÍVEL.
		this.tipoCombustivel = tipoCombustivel;
	}

	public void alterarQuantidadeCombustivel(float quantidadeCombustivel) {  //ALTERA A QUANTIDADE DE COMBUSTÍVEL RESTANTE NA BOMBA.
		this.setQuantidadeCombustivel(quantidadeCombustivel);
	}

	/*
	 * ABASTECERPORVALOR: MÉTODO ONDE É INFORMADO O VALOR A SER ABASTECIDO E MOSTRA
	 * A QUANTIDADE DE LITROS QUE FOI COLOCADA NO VEÍCULO.
	 */
	public float abastecerPorValor(float valor) {
		float temp;
		temp = valor / valorLitro;
		alterarQuantidadeCombustivel(this.getQuantidadeCombustivel() - temp);
		return temp;
	}

	/*
	 * ABASTECERPORLITRO: MÉTODO ONDE É INFORMADO A QUANTIDADE EM LITROS DE
	 * COMBUSTÍVEL E MOSTRA O VALOR A SER PAGO PELO CLIENTE.
	 */
	public float abastecerPorLitro(float qtd) {
		float temp2;
		temp2 = qtd * valorLitro;
		alterarQuantidadeCombustivel(this.getQuantidadeCombustivel() - qtd);
		return temp2;
	}

	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
}
