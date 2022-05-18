package cursojava.classes;

// Esta é nossa classe/objeto que representa o Aluno
public class Aluno {
	
	// Esses são os atributos do Aluno
	public String nome;
	public int idade;
	public String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	public Aluno() {// Cria os dados na memória - Sendo padrão do Java
		// Por trás, sempre quando a gente dar um new Aluno() ele vai chamar esse construtor
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
}
