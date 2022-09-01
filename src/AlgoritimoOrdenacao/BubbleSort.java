package AlgoritimoOrdenacao;

import java.util.Scanner;

public class BubbleSort {
	public int [] ordenaArray( int[] vetor) {
		Boolean ocorreuTroca = true;
		
		while (ocorreuTroca) {
			ocorreuTroca = false;
			
			for(int i = 0; i < (vetor.length - 1); i++) {
				if(vetor[i + 1] < vetor[i]) {
					int temp = vetor[i];
					
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = temp;
					ocorreuTroca = true;
				}
			}
			
		}
		
		return vetor;
	}
	
	public static void main(String[] args) {
		//Declaração de variaveis
		Scanner leitorTeclado = new Scanner(System.in);
		
		int[] arrayInteiros = new int[5];
		
		for (int i = 0; i < arrayInteiros.length; i++) {
			System.out.print("Digita algum numero na posicao array[" + i + "] : ");
			
			arrayInteiros[i] = leitorTeclado.nextInt();
			
		}
		
		leitorTeclado.close();
		
		//Processamento
		
		//Saida de dados
		for( int i = 0; i < arrayInteiros.length; i++) {
			if(i == 0) {
				System.out.println("Mostrando os dados de forma ordenada! array[]: ");
				
			}
			
			System.out.print("|" + arrayInteiros[i] + "| ");
		}
		
	}
}
