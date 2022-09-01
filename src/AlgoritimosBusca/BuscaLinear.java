package AlgoritimosBusca;

import java.util.Scanner;

public class BuscaLinear {
	
	private static int procurarVetor(int [] vetor, int valor) {
		int retorno = -1;
		for (int i = 0; i < vetor.length ; i++) {
			if(vetor[i] == valor) {
				retorno = i;
				break;
			}
		}
		return retorno;
	}
	
	public static void main(String[] args) {
		//Declaração de variaveis
		Scanner leitorTeclado = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int procura = 0;
		int achei = 0;
		
		// Entrada de Dados
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digita algum numero na posicao array[" + i + "] : ");
			vetor[i] = leitorTeclado.nextInt();
		}
		
		System.out.print("Digita um dado de coleta");
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
