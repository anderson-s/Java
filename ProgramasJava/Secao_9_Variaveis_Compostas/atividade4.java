package Secao_9_Variaveis_Compostas;

import java.util.Scanner;

public class atividade4 {
	public static void main(String [] args) {
		Scanner silva = new Scanner(System.in);
		int n = 20;
		int vetor[] = new int[n];
		int soma = 0;
		
		System.out.println("Digite os valores que serão armazenados no vetor");
		for(int i = 0; i < n; i++) {
			int valor = silva.nextInt();
			vetor[i] = valor;
		}
		System.out.print("A soma dos valores ");
		for(int i = 0; i < n; i++) { 
			System.out.print(vetor[i] + "+");
		}
		silva.close();
		System.out.println("É igual a : " + soma);
	}

}
