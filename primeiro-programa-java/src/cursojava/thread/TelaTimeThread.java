package cursojava.thread;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {

	public TelaTimeThread() {/*Executa o que tiver dentro no momento da abertura ou execu��o*/

		setTitle("Minha tela de time com Thread");
		setSize(240, 240);
		setLocationRelativeTo(null); 
		setResizable(false);
		/*Primeira parte conclu�da*/
		
		
		
		
		
		/*Sempre ser� o �ltimo comando*/
		setVisible(true);/*Torna a tela v�sivel para o usu�rio*/
	
	}
	
}
