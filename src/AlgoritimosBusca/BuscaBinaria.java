package AlgoritimosBusca;


import java.util.Scanner;

import AlgoritimoOrdenacao.BubbleSort;

public class BuscaBinaria {
	
	private static int procurarVetor(int [] vetor, int valor) {
		
		BubbleSort objOrdenado = new BubbleSort();  
		int retorno = -1;
		int inicio = 0;
		int fim = (vetor.length - 1);
		int meio = 0;
		
		//Garante que o vetor esta ordenado
		vetor = objOrdenado.ordenaArray(vetor);
		
		while ((retorno == -1) && (fim >= inicio)) {
			meio = ((inicio + fim) / 2);
			
			if(vetor[meio] == valor){
				retorno = meio;
			} else if(vetor[meio] > valor) {
				fim = (meio -1);
			} else {
				inicio = (meio + 1);
			}
		}
		
		return retorno;
	}
	
	public static void main(String[] args) {
		//Declaração de variaveis
		Scanner leitorTeclado = new Scanner(System.in);
		
		int[] vetor = new int[11];
		int procura = 0;
		int achei = 0;
		
		// Entrada de Dados
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digita algum numero na posicao array[" + i + "] : ");
			vetor[i] = leitorTeclado.nextInt();
		}
		
		System.out.print("Digita um dado de coleta: ");
		procura = leitorTeclado.nextInt();
		
		leitorTeclado.close();
		// Processamento
		
		achei = procurarVetor(vetor, procura);
		
		//Saida
		if(achei == -1) {
			System.out.print("Não achei este valor");
		} else {
			System.out.print("Encontrei o valor (" + procura + ") na possição array[" + achei + "]");
		}
		
	}
}
