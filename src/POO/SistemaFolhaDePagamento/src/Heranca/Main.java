package Heranca;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Vendedor v = new Vendedor();
		v.setNome("Vivian");
		v.setSalario(1000.f);
		v.setCpf("12345678");
		v.setDataNascimento(new Date());
		v.setComissaoVendas(10.0f);
		v.setTotalVendas(10);
		
		System.out.println("salário do vendedor é:" + v.calculaSalario()); 
		
		Motorista m = new Motorista();
		m.setNome("João");
		m.setSalario(1050.f);
		m.setCpf("789456321");
		m.setDataNascimento(new Date());
		m.setHorasExtras(3.0f);
		m.setValorHoraExtra(2.0f);
		
		System.out.println("salário do motorista é:" + m.calculaSalario()); 

	}
	
}
