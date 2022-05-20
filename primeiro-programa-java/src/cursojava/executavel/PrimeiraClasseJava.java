package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matemática");
		disciplina2.setNota(80);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografica");
		disciplina3.setNota(97);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setNota(70);
		disciplina4.setDisciplina("Java Web");
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		
		System.out.println(aluno1);// é o mesmo que Sysout(aluno1.toString())
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
	} 
	
}
