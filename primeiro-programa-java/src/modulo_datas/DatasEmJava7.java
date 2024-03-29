package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class DatasEmJava7 {

	public static void main(String[] args) throws InterruptedException {

		Instant inicio = Instant.now();
		
		Thread.sleep(2000); /*Pode ser um processo com tempo qualquer que n�o conhecemos*/
		
		Instant iFinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, iFinal);
		
		System.out.println("Dura��o em nano segundos: " + duracao.toNanos());
		
		System.out.println("Dura��o em minutos: " + duracao.toMinutes());
		
		System.out.println("Dura��o em horas: " + duracao.toHours());
		
		System.out.println("Dura��o em milisegundos: " + duracao.toMillis());
		
		System.out.println("Dura��o em dias: " + duracao.toDays());
		
	}

}
