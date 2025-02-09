import java.util.Random;

public class array4D {
	public static void main(String[] args) {
		int[][][][] array = new int[4][5][5][5];// Declara um array tridimensional
		preencher(array);// Chama o metodo para preencher o array com números aleatórios
		imprimir(array);// Chama o método para exibir o array na tela
	}

	// Método preencher Preenche o array com números aleatórios
	public static void preencher(int[][][][] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					for (int l = 0; l < array[i][j][k].length; l++) {
						array[i][j][k][l] = rand.nextInt(100);// Gera um número aleatório entre 0 e 99
					}
				}
			}
		}
	}

	// Método imprimir Exibe os valores armazenados
	public static void imprimir(int[][][][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Quadridimensional  " + i);
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					for (int l = 0; l < array[i][j][k].length; l++) {
						System.out.printf("%02d ", array[i][j][k][l]);//O printf("%02d ") formata os números para que sempre tenham dois dígitos (exemplo: 01, 05, 99).
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
