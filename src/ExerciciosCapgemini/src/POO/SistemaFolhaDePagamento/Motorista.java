package POO.SistemaFolhaDePagamento;

public class Motorista extends Funcionario{
	
	private String itinerario;
	private float horasExtras;
	private float valorHoraExtra;

	public Motorista () {
		super();
	}
	
	public float calculaSalario() {
		return super.getSalario()+(this.horasExtras * this.valorHoraExtra);
	}

	public String getItinerario() {
		return itinerario;
	}

	public void setItinerario(String itinerario) {
		this.itinerario = itinerario;
	}

	public float getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(float horasExtras) {
		this.horasExtras = horasExtras;
	}

	public float getValorHoraExtra() {
		return valorHoraExtra;
	}

	public void setValorHoraExtra(float valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}
	
}
