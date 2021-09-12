package Secao_9_Variaveis_Compostas;

import java.util.Scanner;

public class atividade3 {

	public static void main(String [] args) {
		Scanner silva = new Scanner(System.in);
		int n = 10;
		int vetor[] = new int[n];
		
		System.out.println("Digite os valores que ser�o armazenados no vetor");
		for(int i = 0; i < n; i++) {
			int valor = silva.nextInt();
			vetor[i] = valor;
		}
		for(int indice = 9; indice >= 0; indice--) { 
			System.out.println("vetor[" + indice + "] = " + vetor[indice]);
		}
		silva.close();
	}

}
