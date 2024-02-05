package DatasTratamento;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.TimeZone;

//AULA 13B
//SDF SIMPLE DATE FORMAT - CLASSE QUE PERMITE A FORMATAÇÃO DE DATAS
public class DatasUsandoSDF {

	public static void main(String[] args) throws ParseException {
		
		// USANDO SDF - SIMPLE DATE FORMAT
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));//SETANDO sdf3 PARA TRAZER A DATA NO FOMATO GREENWICH MEAN TIME (HORA DE GREENWICH)
		
		java.util.Date x1 = sdf1.parse("29/12/2021");
		java.util.Date x2 = new java.util.Date(System.currentTimeMillis());
        java.util.Date x3 = new java.util.Date(0L);
        java.util.Date x4 = new java.util.Date(1000L * 60L * 60L * 5L);//MONTAGEM DA DATA BASEADA EM CÁLCULOS
		
        java.util.Date y1 = sdf1.parse("29/12/2021");
        java.util.Date y2 = sdf2.parse("29/12/2021 16:32:55");//CONVERRTER A STRING EM DATA USANDO sdf2
        java.util.Date y3 = Date.from(Instant.parse("2021-12-29T16:32:55Z"));

		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-----------------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-----------------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
	}
}
