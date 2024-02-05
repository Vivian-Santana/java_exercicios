package DatasTratamento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//AULA 13D

public class ConversaoDatas {

	public static void main(String[] args) throws ParseException {

		// CRIA UMA INSTÂNCIA DO OBJETO CALENDAR. O CALENDAR É UMA CLASSE EM JAVA QUE
		// FORNECE MÉTODOS PARA OPERAÇÕES DE CALENDÁRIO, COMO OBTER A DATA E A HORA
		// ATUAIS.
		Calendar c = Calendar.getInstance();

		// CRIA UM OBJETO DATE REPRESENTANDO A DATA E HORA ATUAIS.
		java.util.Date data = new java.util.Date();

		// FORMATAÇÃO DE DATAS
		/*
		 * CRIA UMA INSTÂNCIA DE SIMPLEDATEFORMAT PARA DEFINIR O FORMATO DESEJADO
		 * (DIA/MÊS/ANO). USA O MÉTODO FORMAT PARA CONVERTER O OBJETO DATE EM UMA STRING
		 * FORMATADA DE ACORDO COM O FORMATO DEFINIDO.
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: " + sdf.format(data));

		// CONVERÇÃO DE DATAS

		/*
		 * USA O MÉTODO PARSE PARA CONVERTER UMA STRING NO FORMATO ESPECIFICADO DE VOLTA
		 * PARA UM OBJETO DATE. A STRING "02/08/1970" É CONVERTIDA PARA UM OBJETO DATE E
		 * DEPOIS IMPRESSA
		 */
		System.out.println("Data convertida: " + sdf.parse("02/08/1970"));

	}

}
