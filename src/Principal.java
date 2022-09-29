package Arvore;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		Arvore objArvore = new Arvore();
		int opcao = 0;

		// Processamento
		do {
			System.out.println("+================+");
			System.out.println("| Menu de opções |");
			System.out.println("+================+");
			System.out.println("| 1 - Inserir    |");
			System.out.println("| 2 - Pré-Ordem  |");
			System.out.println("| 3 - Em-Ordem   |");
			System.out.println("| 4 - Pós-Ordem  |");
			System.out.println("| 5 - Sair   	 |");
			System.out.println("+================+");
			System.out.println("Digite sua opção: ");
			opcao = leitor.nextInt();

			if (opcao == 1) {
				System.out.println("+======================+");
				System.out.println("1 - 200 numero random");
				System.out.println("2 - Inserir manualmente");
				System.out.println("+======================+");
				System.out.println("Digite sua opção: ");
				
				switch (leitor.nextInt()) {
					case 1:
						for(int i = 1000000; i >= 0; i--) {
							int numeroAleatorio = ((int)(Math.random() * 100));
							
							objArvore.inserir(numeroAleatorio);
						}
					
						break;
					case 2:
						System.out.print("Digite o número: ");
						objArvore.inserir(leitor.nextInt());
						break;
				}
			} else if (opcao == 2) {
				objArvore.navegacaoPreOrdem();
				System.out.println();
			} else if (opcao == 3) {
				objArvore.navegacaoEmOrdem();
				System.out.println();
			} else if (opcao == 4) {
				objArvore.navegacaoPosOrdem();
				System.out.println();
			}
		} while (opcao != 5);

		leitor.close();
	}
}
