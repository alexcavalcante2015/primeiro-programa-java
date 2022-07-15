package cursojava.executavel;

public class Matriz {

	/*Executar o código Java*/
	public static void main(String[] args) {

		int[][] notas = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;
		
		System.out.println(notas);
		
		/*Percorre as linhas*/
		for (int posLinha = 0; posLinha < notas.length; posLinha++) {
			System.out.println("========================================================");
			/*Para cada linha Percorrer as colunas ARRAY*/
			for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {
				System.out.println("Valor da matriz: " + notas[posLinha][posColuna]);
			}
		}
		
	}

}
