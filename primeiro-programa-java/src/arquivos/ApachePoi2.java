package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {

	public static void main(String[] args) throws Exception {

		FileInputStream entrada = new FileInputStream(
				new File("C:\\Users\\Alex\\git\\repository\\primeiro-programa-java\\src\\arquivos\\arquivo_excel.xls"));
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); /*Prepara a entrada do arquivo do exce para ler*/
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); /*Pega primeira planilha do nosso arquivo excel*/
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while (linhaIterator.hasNext()) { /*Enquanto tiver linha no arquivo excel*/
			
			Row linha = linhaIterator.next(); /*Dados da pessoa na linha*/
			
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa = new Pessoa();
			
			while (celulas.hasNext()) { /*Percorrer as c�lulas*/
				Cell cell = celulas.next();
				
				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2: 
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				} 
				
			} /*Fim das c�lulas da linha*/
			
			pessoas.add(pessoa);
			
		}
		
		entrada.close(); /*Terminou de ler o arquivo excel*/
		
		for (Pessoa pessoa : pessoas) { /*Poderia gravar no banco de dados, mandar email e etc*/
			System.out.println(pessoa);
		}
		
	}

}
