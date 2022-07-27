package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();

		Date date = new Date();

		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());

		System.out.println("Dia do mês (Date): " + date.getDate());

		System.out.println("Dia do mês (Calendar): " + calendar.get(calendar.DAY_OF_MONTH));

		System.out.println("Dia da semana (Date): " + date.getDay());
		
		System.out.println("Dia da semana (Calendar): " + (calendar.get(calendar.DAY_OF_WEEK) - 1));

		System.out.println("Hora do dia (Date): " + date.getHours());

		System.out.println("Hora do dia (Calendar): " + calendar.get(calendar.HOUR_OF_DAY));
		
		System.out.println("Minuto da hora (Date): " + date.getMinutes());
		
		System.out.println("Minuto da hora (Calendar): " + calendar.get(calendar.MINUTE));

		System.out.println("Segundos (Date): " + date.getSeconds());

		System.out.println("Segundos (Calendar): " + calendar.get(calendar.SECOND));

		System.out.println("Ano (Date): " + (date.getYear() + 1900));

		System.out.println("Ano (Calendar): " + (calendar.get(calendar.YEAR)));
		
		/*----------------- Simple Date Format --------------------*/

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");

		System.out.println("Data atual em formato padrão e String (Date): " + simpleDateFormat.format(date));

		System.out.println("Data atual em formato padrão e String (Calendar): " + simpleDateFormat.format(calendar.getTime()));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

		System.out.println("Data em formato para banco de dados (Date): " + simpleDateFormat.format(date));
		System.out.println("Data em formato para banco de dados (Calendar): " + simpleDateFormat.format(calendar.getTime()));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Objeto Date: " + simpleDateFormat.parseObject("1987-10-18"));

		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: " + simpleDateFormat.parseObject("18/10/1987"));


	}

}