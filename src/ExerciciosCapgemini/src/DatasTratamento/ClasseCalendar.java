package DatasTratamento;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//AULA 13C
public class ClasseCalendar {

	public static void main(String[] args) {

		// RECUPERAÇÃO DA DATA COM A CLASSE CALENDAR
		System.out.println("==> Recuperação da data com a classe Calendar");
		Calendar cal = Calendar.getInstance();
		System.out.println("Data e Hora atual: " + cal.getTime() + "\n");

		/*
		 * OBS:O MÉTODO cal.get(Calendar.MONTH) RETORNA O MÊS COMEÇANDO DE ZERO, ENTÃO
		 * JANEIRO É 0, FEVEREIRO É 1 E ASSIM POR DIANTE. RARA MOSTAR DE MODO MAIS
		 * INTUITIVO USA-SE ESSE RECURSO. ADICIONE 1 AO MÊS PARA EXIBIR CORRETAMENTE.
		 */
		int mes = cal.get(Calendar.MONTH) + 1;

		// ESSA CLASSE IMPRIME O NOME DO MÊS DE FORMA ABREVIADA NA SAÍDA
		SimpleDateFormat sdf = new SimpleDateFormat("MMM");

		// MOSTRA O DIA DA SEMANA, MÊS E ANO
		System.out.println("==> Mostra o dia da semana, mês e ano");
		System.out.println("Data/Hora atual: " + cal.getTime());
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("Mês: " + mes);
		System.out.println("Dia do Mês: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");

		// ALTERANDO A DATA/HORA COM MÉTODO SET
		System.out.println("==> Alterando a data/hora com método set");
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 04);

		System.out.println("Data/Hora atual: " + cal.getTime());
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("Mês: " + cal.get(Calendar.MONTH) + "-" + sdf.format(cal.getTime()));
		System.out.println("Dia do Mês: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");

		// RECUPERANDO A HORA DO DIA
		System.out.println("==> Recuperando a hora do dia");

		Calendar cal1 = Calendar.getInstance();
		int hora = cal1.get(Calendar.HOUR_OF_DAY);
		System.out.println("Agora são: " + hora + " hrs");
		if (hora > 6 && hora < 12) {
			System.out.println("Bom Dia!");
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}
	}

}
