package cursojava.interfaces;

// essa interface ser� o nosso contrato de autentica��o
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha); // podemos definir met�dos e par�metros
	
	public boolean autenticar();
	
}
