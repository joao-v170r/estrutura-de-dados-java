package Matrizes;
import java.util.Scanner;

public class PreenchimentoInvertido {
	public static void main(String[] args) {
		 //Declaração variaveis
		 int [] arrayExemplo = new int[5];
		 int [] arrayInvertido =  new int[5];
		 
		 Scanner olho = new Scanner(System.in);
		 
		 // Enrada de Dados
		 
		 for (int i = 0; i < arrayExemplo.length ; i++) {
			 
			 System.out.print("digite o valor da posicão " + i + " do vetor: ");		
			 arrayExemplo[i] = olho.nextInt();
			 
			 //Processamento
			 
			 arrayInvertido[arrayInvertido.length - (i + 1)] = arrayExemplo[i];
		 }
		 
		 olho.close();
		 
		 //Saida de Dados
		 for (int valor : arrayInvertido) {
			 System.out.println("rotev od " + valor + "  oãcisop ad rolav o etigid !"); 
		 }
		 System.out.println("Segundo codigo"); 
	 }
}
