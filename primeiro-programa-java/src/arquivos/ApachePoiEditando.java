package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\Alex\\git\\repository\\primeiro-programa-java\\src\\arquivos\\arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); /*Prepara a entrada do arquivo xls do excel*/
		
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); /*Pegamos a planilha*/
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while (linhaIterator.hasNext()) { /*Enquanto tiver linha*/
			Row linha = linhaIterator.next(); /*Dados da pessoa na linha*/
			
			int numeroCelulas = linha.getPhysicalNumberOfCells(); /*Quantidade de c�lulas*/
			
			Cell cell = linha.createCell(numeroCelulas); /*Cria nova c�lula na linha*/
			cell.setCellValue("5.487,20");
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada");
		
	}

}
