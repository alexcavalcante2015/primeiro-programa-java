package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\Alex\\git\\repository\\primeiro-programa-java\\src\\arquivos\\arquivo_excel.xls");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("Alex Egidio");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(25);
		pessoa2.setNome("Marcos Tadeu");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(40);
		pessoa3.setNome("Maria Jesus");
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setEmail("pessoa4@gmail.com");
		pessoa4.setIdade(45);
		pessoa4.setNome("Paulo Pedro");
		
		/*Essa lista pode vir do banco de dados ou qualquer fonte de dados*/
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); /*Vai ser usado para escrever a planilha.*/
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas Jdev Treinamento"); /*Criar a planilha*/
		
		int numeroLinha = 0;
		
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha++); /*Criando a linha na planilha*/
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula++); /*Celula 1*/
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula++); /*Celula 2*/
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula++); /*Celula 3*/
			celIdade.setCellValue(p.getIdade());
			
		} /*terminou de montar a planilha*/
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida); /*Escreve a planilha em arquivo*/
		saida.flush();
		saida.close();
		
		System.out.println("Planilha foi criada");
		
	}

}
