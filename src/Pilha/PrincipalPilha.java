package Pilha;

import java.util.Scanner;


public class PrincipalPilha {
	public static void main(String[] args) {
		//Declaração de variaveis
		
		
		Pilha pilha = new Pilha();
		
		Scanner leitorTeclado = new Scanner(System.in);
		int opcao = 0;
		
		int resposta = 0;
		
		while (opcao != 4) {
			System.out.println("+=======menu=================+");
			System.out.println("+ 1 - Inserir                +");
			System.out.println("+ 2 - Remover                +");
			System.out.println("+ 3 - Ultimo elemento        +");
			System.out.println("+ 4 - Sair                   +");
			System.out.println("+ 5 - Explodir               +");
			System.out.println("+ 6 - Listar Pilha           +");
			System.out.println("+============================+");
			
			opcao = leitorTeclado.nextInt();
			switch (opcao) {
				case 1:
					while(resposta != -1) {
						
						System.out.println("Insira o numero ou -1 para sair");
						resposta = leitorTeclado.nextInt();
						
						if (resposta != -1) {
							pilha.push(resposta);
						}
					}
						
					break;
				case 2:
					pilha.pop();
					break;
				case 3:
					pilha.top();
					break;
				case 6:
					pilha.exibiPilha();
					break;
				case 5:
					while(true) {
						pilha.push(10);
						pilha.top();
					}
					
			}
			
			
		}
		
		leitorTeclado.close();
	}
		
}
