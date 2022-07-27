package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava2 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("01/04/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("11/04/2021");
		
		// after : se data1 é maior que data 2
		// before : se data1 é menor que data 2
		
		if (dataVencimentoBoleto.before(dataAtualHoje)) {/*se a data 1 é menor que a data 2*/
			System.out.println("Boleto vencido - URGENTE");
		} else {
			System.out.println("Boleto não vencido");
		}
		
	}

}
