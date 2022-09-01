package ListaEncadeada;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Declaração de variaveis
		
		Scanner input = new Scanner(System.in);
		
		No cabeca = null;
		No ponteiro = null;
		No novoNo = null;
		int numero = 0;
		
		//Construcao da lista
		while(true) {
			System.out.println("Digite um numero para se armazenado na lista ou {-1} para sair");
			numero =input.nextInt();
			
			if(numero == -1) {
				break;
			}
			
			if(cabeca == null) {
				cabeca = new No(numero, null);
			} else {
				ponteiro = cabeca;
				while(ponteiro.getProximo() != null) {
					ponteiro = ponteiro.getProximo();
				}
				
				novoNo = new No(numero, null);
				
				ponteiro.setProximo(novoNo);
			}			
			
		}
		
		ponteiro = cabeca;
		
		while (ponteiro != null) {
			if(ponteiro.getProximo() != null) {
				System.out.print("|" + ponteiro.getNumero() + "|, ");
				
			} else {
				System.out.println("|" + ponteiro.getNumero() + "|");
			}
			
			ponteiro = ponteiro.getProximo();
		}
		
		//Remoção de no
		System.out.println("Digite o numero que voce não deseja: ");
		
		numero = input.nextInt();
		
		input.close();
		
		ponteiro = cabeca;
		
		if(ponteiro.getNumero() == numero) {
			cabeca = cabeca.getProximo();
		} else {
			ponteiro = cabeca;
			while ((ponteiro != null) && (ponteiro.getProximo() != null)) {
				if(ponteiro.getProximo().getNumero() == numero) {
					ponteiro.setProximo(ponteiro.getProximo().getProximo());
				}
				
				ponteiro = ponteiro.getProximo();
			}
		}
		
		
		ponteiro = cabeca;
		
		while (ponteiro != null) {
			if(ponteiro.getProximo() != null) {
				System.out.print("|" + ponteiro.getNumero() + "|, ");
				
			} else {
				System.out.print("|" + ponteiro.getNumero() + "|");
			}
			
			ponteiro = ponteiro.getProximo();
		}
		
	}
}
