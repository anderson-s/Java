package Secao_9_Variaveis_Compostas;

import java.util.Scanner;

public class atividade1 {
	public static void main(String [] args) {
		Scanner silva = new Scanner(System.in);
		int n = 5;
		int vetor[] = new int[n];
		int aux = 0;
		System.out.println("Digite os valores que serão armazenados no vetor");
		while(aux < n) {
			int valor = silva.nextInt();
			if((valor > 0)&&(valor % 2 == 0)) {
				vetor[aux] = valor;
				aux++;
			}
		}
		for(int indice = 0; indice < aux; indice++) {
			System.out.println("vetor[" + indice + "] = " + vetor[indice]);
		}
		silva.close();
		
	}

}
