package Secao7_Estruturas_de_Decisao;

import java.util.Scanner;

public class atividade5 {

	public static void main(String [] args) {
		//Variaveis
		Scanner silva = new Scanner(System.in);
		float peso, excesso, multa;
		//Entradas
		System.out.println("Digite o peso total de peixes pescados");
		peso= silva.nextFloat();
		
		//Processamentos
		if(peso > 50) {
			excesso = peso - 50;
			multa = (float)(excesso * 4.0);
			System.out.printf("O valor da multa é de R$ %.2f",multa);
		}
		else{
			excesso = 0;
			multa = 0;
			System.out.printf("Você não vai pagar a multa");
		} 
		silva.close();
		
}
}