package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	// Main � um m�todo auto execut�vel em Java
	public static void main(String[] args) {
		
		/* 
		 * new Aluno() � uma inst�ncia (Cria��o de Objeto)
		 * aluno1 � uma refer�ncia para o objeto aluno
		 */
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual � o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da m�e");
		String pai = JOptionPane.showInputDialog("Nome do pai");
		String dataMatricula = JOptionPane.showInputDialog("Data da matr�cula");
		String serie = JOptionPane.showInputDialog("Qual a serie");
		String escola = JOptionPane.showInputDialog("Nome da escola");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		Aluno aluno1 = new Aluno();// Aqui ser� o Jo�o
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome � = " + aluno1.getNome());
		System.out.println("Idade � = " + aluno1.getIdade());
		System.out.println("Noem m�e = " + aluno1.getNomeMae());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("M�dia da nota � = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		
		
	} 
	
}
