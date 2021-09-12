package Secao_9_Variaveis_Compostas;

import java.util.Scanner;

public class atividade2 {

	public static void main(String [] args) {
		Scanner silva = new Scanner(System.in);
		int n = 10;
		int primeiro_vetor[] = new int[n];
		int segundo_vetor[] = new int[n];
		int terceiro_vetor[] = new int[n];
		
		System.out.println("Digite os valores que serão armazenados no primeiro vetor");
		for(int i = 0; i < 10; i++) {
			int valor = silva.nextInt();
			primeiro_vetor[i] = valor;
		}
		System.out.println("Digite os valores que serão armazenados no segundo vetor");
		for(int i = 0; i < 10; i++) {
			int valor = silva.nextInt();
			segundo_vetor[i] = valor;
		}
		
		for(int indice = 0; indice < n; indice++) {
			terceiro_vetor[indice] = primeiro_vetor[indice] + segundo_vetor[indice]; 
			System.out.println("vetor[" + indice + "] = " + terceiro_vetor[indice]);
		}
		silva.close();
	}

}
