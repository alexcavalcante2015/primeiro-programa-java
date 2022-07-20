package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		/*Thread processando em paralelo do envio de email*/
		new Thread() {
			
			public void run() {/*Executa o que n�s queremos*/
				/*C�digo da rotina*/
				/*C�digo da rotina que eu quero executar em paralelo*/
				for (int pos = 0; pos < 10; pos++) {
					
					/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
					System.out.println("Executando alguma rotina, por exemplo, envio de email");
					
					try {
						Thread.sleep(1000);/*D� um tempo*/
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				/*Fim do c�digo em paralelo*/
			};
			
		}.start();/*Start liga a thread que fica processando paralelamente por tr�s*/
		
		
		//****************** DIVIS�O DAS THREAD
		
		
		/*Thread processando em paralelo do envio de nota fiscal*/
		new Thread() {
			
			public void run() {/*Executa o que n�s queremos*/
				/*C�digo da rotina*/
				/*C�digo da rotina que eu quero executar em paralelo*/
				for (int pos = 0; pos < 10; pos++) {
					
					/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
					System.out.println("Executando alguma rotina, por exemplo, envio de nota fiscal");
					
					try {
						Thread.sleep(4000);/*D� um tempo*/
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				/*Fim do c�digo em paralelo*/
			};
			
		}.start();/*Start liga a thread que fica processando paralelamente por tr�s*/
		
		/*C�digo do sistema do usu�rio continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE DE THREAD");
		/*Fluxo do sistema, cadastro de venda, uma emiss�o de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
		
	}

}
