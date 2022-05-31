package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*	
 *  Fun��o disso aqui �: Realmente e somente receber algu�m que tem o contrato da interface 
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
