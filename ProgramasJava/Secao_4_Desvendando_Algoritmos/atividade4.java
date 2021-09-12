package Secao_4_Desvendando_Algoritmos;

import java.util.Scanner;
public class atividade4 {
	public static void main(String [] args) {
		Scanner tcl = new Scanner(System.in);
		int num1, num2;
		System.out.println("Digite a primeiro valor");
		num1 = tcl.nextInt();
		System.out.println("Digite o segundo valor");
		num2 = tcl.nextInt();
		tcl.close();
		System.out.println("O valor da soma é: " + (num1 + num2));
		
	}
}
