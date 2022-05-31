package cursojava.interfaces;

// essa interface será o nosso contrato de autenticação
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha); // podemos definir metódos e parâmetros
	
	public boolean autenticar();
	
}
