package MatrizesEsparsas;

import ListaEncadeada.No;

public class MatrizesEsparsas {
	
	private static final int DIVISOR = 10;
	private NoAgrupado cabeca = null;
	
	public void inserir(int numero) {
		//Declaracao de variavei
		int resto = (numero % DIVISOR);
		
		No ponteiroNo;
		
		NoAgrupado ponteiroNoAgrupado = procuraGroupo(resto);
		
		if(ponteiroNoAgrupado == null) {
			ponteiroNoAgrupado = new NoAgrupado(resto, null, getCabeca());
			
			setCabeca(ponteiroNoAgrupado);
		}
		
		ponteiroNo = new No(numero, ponteiroNoAgrupado.getProximo());
		ponteiroNoAgrupado.setProximo(ponteiroNo); 
	}
	
	public void mostrarMatriz() {
		NoAgrupado ponteiroNoAgrupador;
		No ponteiroNo;
		
		ponteiroNoAgrupador = getCabeca();
		while(ponteiroNoAgrupador != null){
			System.out.print("Groupo dos numero que o resto da divisão por: " + DIVISOR + " é: " + ponteiroNoAgrupador.getResto() +" [");
			
			ponteiroNo = ponteiroNoAgrupador.getProximo();
			
			while(ponteiroNo != null) {
				System.out.print(ponteiroNo.getNumero() + "\t");
				
				ponteiroNo = ponteiroNo.getProximo();
			}
			
			System.out.println("]");
			
			ponteiroNoAgrupador = ponteiroNoAgrupador.getProximoGrupo();
		}
	}
	
	public void removeNumero(int numero) {
		
		int resto = (numero % DIVISOR);
		
		No ponteiroNo;
		
		NoAgrupado ponteiroNoAgrupado = procuraGroupo(resto);
		
		if(ponteiroNoAgrupado == null) {
			return;
		}
		
		ponteiroNo = ponteiroNoAgrupado.getProximo();
		
		if(ponteiroNo != null) {
			if(ponteiroNo.getNumero() == numero) {
				ponteiroNoAgrupado.setProximo(ponteiroNo.getProximo());
			} else {
				ponteiroNo = procuraProximoNumero(numero, ponteiroNo);
				
				ponteiroNo.setProximo(ponteiroNo.getProximo().getProximo());
			}
		}
	}
	
	private No procuraProximoNumero(int numero, No cabeca) {
		
		No ponteiro = cabeca;
		
		while ((ponteiro != null) && (ponteiro.getProximo() != null)) {
			if (ponteiro.getProximo().getNumero() == numero) {
				break;
			}
			
			ponteiro = ponteiro.getProximo();
			
		}
		
		return ponteiro;
	}
	
	private NoAgrupado procuraGroupo(int resto) {
		NoAgrupado ponteiro = getCabeca();
		
		while(ponteiro != null) {
			if(ponteiro.getResto() == resto) {
				break;
			}
			
			ponteiro = ponteiro.getProximoGrupo();
		}
		
		return ponteiro;
	}

	public NoAgrupado getCabeca() {
		return cabeca;
	}

	public void setCabeca(NoAgrupado cabeca) {
		this.cabeca = cabeca;
	}
	
}
