package MatrizesEsparsas;

import ListaEncadeada.No;

public class NoAgrupado {

	private int resto;
	private No proximo;
	private NoAgrupado proximoGrupo;
	
	
	public NoAgrupado() {
		super();
	}


	public NoAgrupado(int valor, No proximo, NoAgrupado proximoGrupo) {
		super();
		this.resto = valor;
		this.proximo = proximo;
		this.proximoGrupo = proximoGrupo;
	}


	public int getResto() {
		return resto;
	}


	public void setResto(int resto) {
		this.resto = resto;
	}


	public No getProximo() {
		return proximo;
	}


	public void setProximo(No proximo) {
		this.proximo = proximo;
	}


	public NoAgrupado getProximoGrupo() {
		return proximoGrupo;
	}


	public void setProximoGrupo(NoAgrupado proximoGrupo) {
		this.proximoGrupo = proximoGrupo;
	}

	
}
