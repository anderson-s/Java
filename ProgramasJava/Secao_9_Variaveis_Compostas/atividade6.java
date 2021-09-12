package Secao_9_Variaveis_Compostas;

import java.util.Scanner;

public class atividade6 {
	public static void main(String [] args) {
		Scanner silva = new Scanner(System.in);
		int vetor[] = new int[5];
		int numero;
		String complemento;
		
		System.out.println("Digite os valores que serão armazenados no vetor");
		for(int i = 0; i < 5; i++) {
			int valor = silva.nextInt();
			vetor[i] = valor;
		}
		System.out.println("Escolha uma opção: \n 0 - Encerrar o programa \n 1 - Mostrar o vetor na ordem direta \n 2 - Mostrar o vetor na ordem inversa \n");
		numero = silva.nextInt();
		
		if(numero == 0) {
			System.out.println("Programa encerrado");
		}
		else if(numero == 1) {
			System.out.println("O vetor na ordem direta é: ");
			for(int i = 0; i < 5; i++) {
				if(i == 4) {
					complemento = ".";
				}
				else {
					complemento =  ",";
				}
				System.out.print(" " + vetor[i] + complemento);
				
			}
		}
		else if(numero == 2) {
			System.out.println("O vetor na ordem inversa é: ");
			for(int i = 4; i >= 0; i--) {
				if(i == 0) {
					complemento = ".";
				}
				else {
					complemento =  ",";
				}
				System.out.print(" " + vetor[i] + complemento);
				
			}
		}
		silva.close();
		System.out.println("Programa executado com sucesso!");
		
		 
	}

}