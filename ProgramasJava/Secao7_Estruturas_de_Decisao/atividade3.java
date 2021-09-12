package Secao7_Estruturas_de_Decisao;

import java.util.Scanner;

public class atividade3 {
	public static void main(String [] args) {
		Scanner silva = new Scanner(System.in);
		int par, impar, n;
		System.out.print("Digite o valor: ");
		n = silva.nextInt();
		
		if(n % 2 == 0) {
			par = n;
			System.out.println("O número digitado é par: " + par);
		}
		else{
			impar = n;
			  System.out.println("O número digitado é impar: " + impar);
			}
		silva.close();
	}
}
