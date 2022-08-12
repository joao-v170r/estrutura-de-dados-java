package Matrizes;
import java.util.Scanner;

public class TransposicaoMatrix {
	public static void main(String[] args) {
		// Declaração variaveis
		int[][] arrayOriginal = new int[2][3];
		int[][] arrayInvertido = new int[3][2];

		boolean chave = true;

		Scanner olho = new Scanner(System.in);

		// Enrada de Dados

		for (int i = 0; i < arrayOriginal.length; i++) {

			for (int j = 0; j < arrayOriginal[0].length; j++) {

				System.out.print("digite o valor da posicão [" + j + "|" + i + "] do vetor: ");
				arrayOriginal[i][j] = olho.nextInt();

				// Processamento

				arrayInvertido[j][i] = arrayOriginal[i][j];
			}

		}

		olho.close();

		// Saida de Dados
		for (int[] valorA : arrayInvertido) {
			System.out.print("[");
			for (int valorB : valorA) {
				System.out.print(valorB);
				if (chave) {
					System.out.print("|");

					chave = false;
				}

				chave = true;
			}
			System.out.println("]");
		}
		System.out.println("");
		System.out.println("Matrix original");
		System.out.println("");

		for (int[] valorA : arrayOriginal) {
			System.out.print("[");
			for (int valorB : valorA) {
				System.out.print(valorB);
				if (chave) {
					System.out.print("|");
					chave = false;
				} else {
					System.out.print("|");
				}
			}
			
			chave = true;
			System.out.println("]");
		}
		System.out.println("Teceiro codigo");
	}
}
