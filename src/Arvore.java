package Arvore;

public class Arvore {
	private No raiz = null;
	
	public void inserir(int numero) {
		setRaiz(inserir(getRaiz(), numero));
	}
	
	private No inserir(No raiz, int numero) {
		No novoNo = new No(numero, null,null);		
		int sortieo = ((int) (2 * Math.random())); 
		
		if(raiz == null) {
			raiz = novoNo;
		} else if (sortieo == 0) {
			if(raiz.getEsquerda() == null) {
				raiz.setEsquerda(novoNo);
			} else {
				raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
			}
		} else {
			if(raiz.getDireita() == null) {
				raiz.setDireita(novoNo);
			} else {
				raiz.setDireita(inserir(raiz.getDireita(), numero));
			}
		}
		
		return raiz;
	}
	
	public void navegacaoPreOrdem() {
		navegacaoPreOrdem(raiz);
	}
	
	private void navegacaoPreOrdem(No raiz) {
		if(raiz == null) {
			return;
		}
		
		System.out.println(raiz.getNumero() + "\t");
		navegacaoPreOrdem(raiz.getEsquerda());
		navegacaoPreOrdem(raiz.getDireita());
	}
	
	public void navegacaoEmOrdem () {
		navegacaoEmOrdem(getRaiz());
	}
	
	private void navegacaoEmOrdem (No raiz) {
		if(raiz == null) {
			return;
		}
		
		navegacaoEmOrdem(raiz.getEsquerda());
		System.out.println(raiz.getNumero() + "\t");
		navegacaoEmOrdem(raiz.getDireita());
	}
	
	public void navegacaoPosOrdem() {
		navegacaoPosOrdem(raiz);
	}
	
	private void navegacaoPosOrdem(No raiz) {
		if(raiz == null) {
			return;
		}
		
		navegacaoPosOrdem(raiz.getEsquerda());
		navegacaoPosOrdem(raiz.getDireita());
		System.out.println(raiz.getNumero() + "\t");
		
	}

	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}
	
	
}
