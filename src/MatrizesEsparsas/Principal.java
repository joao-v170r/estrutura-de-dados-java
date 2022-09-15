package MatrizesEsparsas;

public class Principal {
	public static void main(String[] args) {
		//Declaração de variaveis
		MatrizesEsparsas matrizDinamica = new MatrizesEsparsas();
		
		for(int i = 0; i < 1000; i++) {
			matrizDinamica.inserir(i);
		}
		
		matrizDinamica.mostrarMatriz();
		
		System.out.println("=======================================================");
		
		matrizDinamica.removeNumero(10);
		matrizDinamica.removeNumero(12);
		matrizDinamica.removeNumero(3);
		matrizDinamica.removeNumero(15);
		matrizDinamica.removeNumero(18);
		
		matrizDinamica.mostrarMatriz();
	}
}
