package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	// Main é um método auto executável em Java
	public static void main(String[] args) {
		
		/* 
		 * new Aluno() é uma instância (Criação de Objeto)
		 * aluno1 é uma referência para o objeto aluno
		 */
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do pai");
		String dataMatricula = JOptionPane.showInputDialog("Data da matrícula");
		String serie = JOptionPane.showInputDialog("Qual a serie");
		String escola = JOptionPane.showInputDialog("Nome da escola");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		Aluno aluno1 = new Aluno();
		
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
		
		System.out.println(aluno1);// é o mesmo que Sysout(aluno1.toString())
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
	} 
	
}
