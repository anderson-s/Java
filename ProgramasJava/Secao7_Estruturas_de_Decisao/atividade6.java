package Secao7_Estruturas_de_Decisao;

import java.util.Scanner;

public class atividade6 {
	public static void main(String [] args) {
		//Variaveis
		int c, hora;
		Scanner silva = new Scanner(System.in);
		float salario, excesso, valor = 10;
		//Entradas
		
		System.out.println("Digite código");
		c = silva.nextInt();
		
		System.out.println("Digite as horas trabalhadas");
		hora = silva.nextInt();
		
		//Processamentos
		if(hora > 50) {
			excesso = (hora - 50)*20;
			salario = (float)(excesso * 4.0);
			System.out.printf("O código digitado foi: %d", c);
			System.out.printf("O salario total do operário é: %.2f\n", salario);
			System.out.printf("O excesso corresponde a: %.2f\n", excesso);
		}
		else{
			excesso = 0;
	        salario = excesso + (valor * 50);
	        System.out.printf("O salario do operário é: %.2f\n", salario);
		} 
		silva.close();
		
}
}