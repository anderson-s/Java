package Secao_4_Desvendando_Algoritmos;

import java.util.Scanner;
public class atividade6 {
	public static void main(String [] args) {
		Scanner tcl = new Scanner(System.in);
		float valor, horas;
		System.out.println("Digite o valor da hora: ");
		valor = tcl.nextFloat();
		System.out.println("Digite a quantidade de horas que você trabalha por mês: ");
		horas = tcl.nextFloat();
		tcl.close();
		System.out.println("O seu salário vai ser: " + (horas * valor));
		
	}
}
