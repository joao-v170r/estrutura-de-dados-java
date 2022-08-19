package ListaEncadeada;

public class No {
	//Propriedade da classe
	private int numero  = 0;
	private No proximo = null;//Aponta para o proximo No
	
	public No(int numero, No proximo) {
		super();
		this.numero = numero;
		this.proximo = proximo;
	}

	public No() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
}
