package DatasTratamento;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//AULA 13B
public class ConversaoDatas {

	public static void main(String[] args) throws ParseException {
		Calendar c = Calendar.getInstance();
		Date data = (Date) c.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: "+ sdf.format(data));

		//CONVERTE OBJETOS
		System.out.println("Data convertida: "+ sdf.parse("02/08/1970"));

	}

}
