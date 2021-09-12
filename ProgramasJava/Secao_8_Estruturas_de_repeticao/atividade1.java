package Secao_8_Estruturas_de_repeticao;

import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		int valor, maior;
		Scanner tcl = new Scanner(System.in);
		System.out.println("Digite os valores ou digite 0 para terminar o programa \n");
		valor = tcl.nextInt();
		maior = 0;
		
		while(valor != 0) {
			valor = tcl.nextInt();
			
			if(valor >  maior) {
				maior = valor;
			}
		}
		tcl.close();
		System.out.println("O maior valor digitado foi: " + maior);
	}
}
