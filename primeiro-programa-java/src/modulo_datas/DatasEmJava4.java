package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {

		long dias = ChronoUnit.WEEKS.between(LocalDate.parse("2019-01-01"), LocalDate.now());/*Total de dias de uma data até hoje*/
		
		System.out.println("Possui " + dias + " dias entre a faixa de data");
		
	}

}
