package Matrizes;
import java.util.Scanner;

public class main {
 public static void main(String[] args) {
	 //Declaração variaveis
	 int [] arrayExemplo = new int[10];
	 Scanner olho = new Scanner(System.in);
	 
	 // Enrada de Dados
	 
	 for (int i = 0; i < arrayExemplo.length ; i++) {
		 System.out.print("digite o valor da posicão " + i + " do vetor: ");		
		 arrayExemplo[i] = olho.nextInt();
		 
	 }
	 
	 olho.close();
	 
	 //Saida de Dados
	 for (int valor : arrayExemplo) {
		 System.out.println("digite o valor da posicão " + valor + " do vetor!"); 
	 }
	 System.out.println("Bem vindo de volta"); 
 }
}
