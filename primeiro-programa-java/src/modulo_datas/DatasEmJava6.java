package modulo_datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasEmJava6 {

	public static void main(String[] args) {

		/*Nova API de data e hora a partir do Java 8*/
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data Atual: " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora Atual: " + horaAtual);
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e Hora AtuaL: " + dataAtualHoraAtual);
		
	}

}
