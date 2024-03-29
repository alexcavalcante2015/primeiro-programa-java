package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
		
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true) {
			
		synchronized (pilha_fila) {/*Bloquear o acesso a essa lista por outros processos*/
			
			Iterator iteracao = pilha_fila.iterator();
			
			while (iteracao.hasNext()) {/*Enquanto conter dados na lista ir� processar*/
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				
				/*Processar 10 mil notas fiscais*/
				/*Gerar uma lista enorme de emails*/
				/*Gerar um envio em massa de email*/
				System.out.println("-----------------------------------");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();
				
				try {
					Thread.sleep(1000); /*Dar um tempo pra descarga de mem�ria*/
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
			try {
				Thread.sleep(1000);/*Processou toda a lista d� um tempo pra limpeza de mem�ria*/
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		}
		
		
		
	}
	
}
