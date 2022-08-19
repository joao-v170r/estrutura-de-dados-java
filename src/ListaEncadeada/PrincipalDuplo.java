package ListaEncadeada;

import java.util.Scanner;

public class PrincipalDuplo {
	public static void main(String[] args) {
		//Declaração de variaveis
		
		Scanner input = new Scanner(System.in);
		
		NoDuplo cabeca = null;
		NoDuplo ponteiro = null;
		NoDuplo novoNo = null;
		int numero = 0;
		
		//Construcao da lista
		while(true) {
			System.out.println("Digite um numero para se armazenado na lista ou {-1} para sair");
			numero =input.nextInt();
			
			if(numero == -1) {
				break;
			}
			
			if(cabeca == null) {
				cabeca = new NoDuplo(numero, null, null);
			} else {
				ponteiro = cabeca;
				while(ponteiro.getProximo() != null) {
					ponteiro = ponteiro.getProximo();
				}
				
				novoNo = new NoDuplo(numero, ponteiro, null);
				
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
		
		ponteiro = cabeca;
		
		if(ponteiro.getNumero() == numero) {
			cabeca = cabeca.getProximo();
		} else {
			ponteiro = cabeca;
			while ((ponteiro != null) && (ponteiro.getProximo() != null)) {
				
				if(ponteiro.getProximo().getNumero() == numero) {
					ponteiro.setProximo(ponteiro.getProximo().getProximo());
					
					if(ponteiro.getProximo() != null) {
						ponteiro.getProximo().getProximo().setAntererior(ponteiro);
					}
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
