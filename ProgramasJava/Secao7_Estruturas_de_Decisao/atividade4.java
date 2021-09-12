package Secao7_Estruturas_de_Decisao;

import java.util.Scanner;

public class atividade4 {
	public static void main(String [] args) {
		//Variaveis
		Scanner silva = new Scanner(System.in);
		char sexo;
		float altura, peso;
		//Entradas
		System.out.println("Digite seu sexo: \n m - Masculino \n f - Feminino");
		sexo = silva.next().charAt(0);
		System.out.print("Digite sua altura: ");
		altura = silva.nextFloat();
		
		//Processamentos
		if(sexo == 'm') {
			peso = (float)(72.7 * altura) - 58;
			System.out.printf("O peso ideal é: %.2f",peso);
		}
		else if(sexo == 'f') {
			peso = (float)(62.1 * altura) - (float)(44.7);
			System.out.printf("O peso ideal é: %.2f",peso);
		} 
		else if(sexo != 'f' && sexo != 'm'){
			System.out.println("Opção inválida");
			peso = 0;
		}
		silva.close();
		
}
}