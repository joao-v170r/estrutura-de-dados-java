package AlgoritimoOrdenacao;

import java.util.Scanner;

public class OrdenacaoDireta {
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
		for (int i = 0; i < (arrayInteiros.length -1); i++) {
			for(int j = (i + 1); j < arrayInteiros.length ; j++) {
				if(arrayInteiros[j] < arrayInteiros[i]) {
					int temp = arrayInteiros[i];
					arrayInteiros[i] = arrayInteiros[j];
					arrayInteiros[j] = temp;
				}
			}
		}
		
		//Saida de dados
		for( int i = 0; i < arrayInteiros.length; i++) {
			if(i == 0) {
				System.out.println("Mostrando os dados de forma ordenada! array[]: ");
				
			}
			
			System.out.print("|" + arrayInteiros[i] + "| ");
		}
		
	}
}
