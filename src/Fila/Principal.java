package Fila;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Declaração de variaveis
		
		
		Fila objFila = new Fila();
		Scanner leitorTeclado = new Scanner(System.in);
		int opcao = 0;
		int resposta = 0;
		
		while (opcao != 5) {
			System.out.println("+=======menu=================+");
			System.out.println("+ 1 - Inserir                +");
			System.out.println("+ 2 - Remover                +");
			System.out.println("+ 3 - Listar                 +");
			System.out.println("+ 4 - Qual tamanho da fila?  +");
			System.out.println("+ 5 - Sair                   +");
			System.out.println("+============================+");
			
			opcao = leitorTeclado.nextInt();
			switch (opcao) {
				case 1:
					while(resposta != -1) {
						
						System.out.println("Insira o numero ou -1 para sair");
						resposta = leitorTeclado.nextInt();
						
						if (resposta != -1) {
							objFila.insereElemento(resposta);
						}
					}
						
					break;
				case 2:
					objFila.remover();
					break;
				case 3:
					objFila.listar();
					break;
				case 4:
					System.out.println("Existem " + objFila.getQntNo() + " na fila!");
					break;
			}
			
			
		}
		
		leitorTeclado.close();
		
	}
}
