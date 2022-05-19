package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	// Main � um m�todo auto execut�vel em Java
	public static void main(String[] args) {
		
		/* 
		 * new Aluno() � uma inst�ncia (Cria��o de Objeto)
		 * aluno1 � uma refer�ncia para o objeto aluno
		 */
		Aluno aluno1 = new Aluno();// Aqui ser� o Jo�o
		
		aluno1.setNome("Jo�o");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("44554.4544.545");
		aluno1.setNumeroCpf("54544.545454.5454");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDEV Treinamento");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome � = " + aluno1.getNome());
		System.out.println("Idade � = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("M�dia da nota � = " + aluno1.getMediaNota());
		
		//===========================================================================
		System.out.println("--------------------------------------------------------------");
		
		Aluno aluno2 = new Aluno();// Aqui ser� o Pedro
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		
		System.out.println("Aluno 2 Nome � = " + aluno2.getNome());
		System.out.println("Aluno 2 Idade � = " + aluno2.getIdade());
		System.out.println("Aluno 2 Nascimento = " + aluno2.getDataNascimento());
		
		//===========================================================================
		
		Aluno aluno3 = new Aluno();// Aqui ser� o Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);
		
	} 
	
}
