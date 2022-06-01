package cursojava.executavel;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAuntenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {
	
	// Main é um método auto executável em Java
	public static void main(String[] args) {
		
		try {
			
			new File("Arquivo.txt");
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		// tbm pode ser if (new FuncaoAuntenticacao(new Secretario(login, senha)).autenticar()){...}
		if (new FuncaoAuntenticacao(new Diretor(login, senha)).autenticar()) { // vou travar o contrato para autorizar somente quem realmente tem o contrato 100% legítimo
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		// Hashmap  é uma lista que dentro dela temos uma chave que identifica uma sequência de valores também
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>(); // criar o Hashmap
		
		for (int qtd = 1; qtd <= 2; qtd++) {
			
		/* 
		 * new Aluno() é uma instância (Criação de Objeto)
		 * aluno1 é uma referência para o objeto aluno
		 */
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+"?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		
		/*String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do pai");
		String dataMatricula = JOptionPane.showInputDialog("Data da matrícula");
		String serie = JOptionPane.showInputDialog("Qual a serie");
		String escola = JOptionPane.showInputDialog("Nome da escola");*/
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		
		/*aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/
		
		for (int pos = 1; pos <= 1; pos++) { // pedindo apenas uma disciplina pra aula ficar rápida
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) { // Opção SIM é Zero
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0) {
				
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				
			}
			
	
		}
		
		alunos.add(aluno1);
		
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>()); // Define a chave e passa uma lista vazia
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>()); // Define a chave e passa uma lista vazia
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>()); // Define a chave e passa uma lista vazia
		
		for (Aluno aluno : alunos) { // Separei em listas
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else { // o mesmo que else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO))
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
			
		}
		
		System.out.println("---------------- Lista dos Aprovados ---------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média = " + aluno.getMediaNota());
		}
		
		System.out.println("---------------- Lista dos Reprovados ---------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média = " + aluno.getMediaNota());
		}
		
		System.out.println("---------------- Lista dos Recuperação ---------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média = " + aluno.getMediaNota());
		}
		
		} else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		
		} catch (NumberFormatException e) { // se for NumberFormatException vai cair aqui
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace(); // imprime erro no console Java
			
			System.out.println("Mensagem: " + e.getMessage()); // mensagem do erro ou causa
			
			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				
				saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Método de erro: " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class: " + e.getClass().getName());
				
			}
			
			JOptionPane.showMessageDialog(null, "Erro de conversão de número " + saida.toString());
			
		} catch (NullPointerException e) { // se for NullPointException vai cair aqui
			JOptionPane.showMessageDialog(null, "Opaa um null pointer exception: " + e.getClass());
		} catch (Exception e) { // se for qualquer outro tipo de erro vai cair aqui (exceção genérica) 
			e.printStackTrace();
		}
		
	} 
	
}
