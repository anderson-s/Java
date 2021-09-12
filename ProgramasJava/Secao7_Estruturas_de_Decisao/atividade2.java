package Secao7_Estruturas_de_Decisao;

import java.util.Scanner;

public class atividade2 {
	public static void main(String [] args) {
		Scanner silva = new Scanner(System.in);
		int a, b, n;
		System.out.print("Digite o valor: ");
		n = silva.nextInt();
		
		if(n > 0) {
			a = n;
			System.out.println("O número digitado é positivo:" + a);
		}
		else if(n < 0){
			b = n;
			  System.out.println("O número digitado é negativo" + b);
			}
		else {
			n = 0;
			System.out.println("O digitado é nulo: " + n);
		}
		silva.close();
	}

}
