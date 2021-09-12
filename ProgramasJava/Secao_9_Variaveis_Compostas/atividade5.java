package Secao_9_Variaveis_Compostas;

import java.util.Scanner;

public class atividade5 {
	public static void main(String [] args) {
		Scanner silva = new Scanner(System.in);
		int n = 10;
		int vetor[] = new int[n];
		int aux = 0;
		
		System.out.println("Digite os valores que ser�o armazenados no vetor");
		for(int i = 0; i < n; i++) {
			int valor = silva.nextInt();
			vetor[i] = valor;
		}
		for(int i = 0; i < n; i++) { 
			
			if(vetor[i] > 50) {
				System.out.println(vetor[i] + " --> valor maior que 50 na posi��o: " + i);
				aux++;
			}
			
		}
		if(aux == 0) {
				System.out.println("Este vetor n�o possui valores maior que 50");
		}
		silva.close();
	}

}