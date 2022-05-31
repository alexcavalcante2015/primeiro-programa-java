package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*	
 *  Função disso aqui é: Realmente e somente receber alguém que tem o contrato da interface 
 *  de PermitirAcesso e chamar o autenticar
 *  
 * */
public class FuncaoAuntenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAuntenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
}
