package ListaEncadeada;

public class NoDuplo {

	private int numero = 0;
	private NoDuplo anterior = null;
	private NoDuplo proximo = null;
	
	public NoDuplo(int numero, NoDuplo anterior, NoDuplo proximo) {
		super();
		this.numero = numero;
		this.anterior = anterior;
		this.proximo = proximo;
	}
	

	public NoDuplo() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public NoDuplo getAntererior() {
		return anterior;
	}

	public void setAntererior(NoDuplo anterior) {
		this.anterior = anterior;
	}

	public NoDuplo getProximo() {
		return proximo;
	}

	public void setProximo(NoDuplo proximo) {
		this.proximo = proximo;
	}

	
	
	
}
