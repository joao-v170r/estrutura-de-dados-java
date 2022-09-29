package Arvore;

public class No {
	
		private int numero;
		private No esquerda;
		private No direita;
		
		
		public No() {
			super();
			this.numero = 0;
			this.esquerda = null;
			this.direita = null;
			
		}
		
		public No(int numero, No esquerda, No direita) {
			super();
			this.numero = numero;
			this.esquerda = esquerda;
			this.direita = direita;
		}
		
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public No getEsquerda() {
			return esquerda;
		}
		public void setEsquerda(No esquerda) {
			this.esquerda = esquerda;
		}
		public No getDireita() {
			return direita;
		}
		public void setDireita(No direita) {
			this.direita = direita;
		}
		
}
