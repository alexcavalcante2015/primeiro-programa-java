package curso.java.excecao;

public class ExcecaoProcessarNotas extends Exception {
	
	public ExcecaoProcessarNotas(String erro) {
		super("Vixxx um erro no processamento das notas do aluno " + erro);
	}

}
