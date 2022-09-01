package Pilha;

import ListaEncadeada.No;

public class Pilha {
	//Propriedades da class
	private No cabeca = null;

	public No getCabeca() {
		return cabeca;
	}

	public void setCabeca(No cabeca) {
		this.cabeca = cabeca;
	}

	public Pilha() {
		super();
	}

	public Pilha(No cabeca) {
		super();
		this.cabeca = cabeca;
	}
	
	public void push(int numero) {
		No novoNo = new No(numero, getCabeca());
		
		setCabeca(novoNo);		
	}
	
	public void pop() {
		if(getCabeca() == null) {
			System.out.println("Sua cabeca está vazia !!!");
		} else {
			System.out.println("O numero " + getCabeca().getNumero() + " Foi removido");
			
			setCabeca(getCabeca().getProximo());
		}
	}
	
	public void top() {
		if(getCabeca() == null) {
			System.out.println("Sua cabeca está vazia !!!");
		} else {
			System.out.println("O numero " + getCabeca().getNumero() + " está no topo!!");
		}
	}
	
	public void exibiPilha() {
		if(getCabeca() == null) {
			System.out.println("Sua cabeca está vazia !!!");
		} else {
			No ponteiro = getCabeca();
			
			System.out.println("--- Pilha ---");
			do {	
				System.out.println("   | " + ponteiro.getNumero() + " |");
				
				if(ponteiro.getProximo() == null) {
					System.out.println("´`´`´`´`´`´`´`´`´`");
				}
				
				ponteiro = ponteiro.getProximo();
				
			} while (ponteiro != null);
			
		}
	}
}
