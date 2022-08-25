package Fila;

import ListaEncadeada.No;

public class Fila {

	private int qntNo;
	private No cabeca;

	public Fila() {
		super();

		setQntNo(0);
		setCabeca(null);
	}

	public void insereElemento(int numero) {
		No novoNo = new No();

		No ponteiro = null;

		novoNo.setNumero(numero);
		novoNo.setProximo(null);

		if (cabeca == null) {
			setCabeca(novoNo);
		} else {
			ponteiro = getCabeca();

			while (ponteiro.getProximo() != null) {
				ponteiro = ponteiro.getProximo();
			}

			ponteiro.setProximo(novoNo);
		}

		setQntNo(getQntNo() + 1);

	}

	public void remover() {
		if (getCabeca() == null) {
			System.out.println("A fila está vazia !");
		} else {
			System.out.println("Numero removido: " + getCabeca().getNumero());

			setCabeca(getCabeca().getProximo());
		}

		System.out.println();

		setQntNo(getQntNo() - 1);
	}

	public void listar() {
		No ponteiro = getCabeca();

		int qntNosTotal = 0;

		while (ponteiro != null) {
			if (ponteiro == cabeca) {
				System.out.println();

				System.out.print("Fila - |" + qntNosTotal++ + " => " + ponteiro.getNumero() + "|,");
			} else if (ponteiro.getProximo() != null) {
				System.out.print(" |" + qntNosTotal++ + " => " + ponteiro.getNumero() + "|,");
			} else {
				System.out.println(" |" + qntNosTotal++ + " => " + ponteiro.getNumero() + "| Fim;");
			}

			ponteiro = ponteiro.getProximo();
		}
	}

	public int getQntNo() {
		return qntNo;
	}

	public void setQntNo(int qntNo) {
		this.qntNo = qntNo;
	}

	public No getCabeca() {
		return cabeca;
	}

	public void setCabeca(No cabeca) {
		this.cabeca = cabeca;
	}

}
