package Secao_8_Estruturas_de_repeticao;
import java.util.Scanner;

public class atividade6 {
	public static void main(String [] args) {
		System.out.println("Digite número de 1 a 10");
		Scanner tcl = new Scanner(System.in);
		int valor = tcl.nextInt();
		
		if((valor > 10)||(valor < 1)) {
			System.out.println("Digite um número novamente");
			valor = tcl.nextInt();
		}
		if((valor < 11)&&(valor > 0)) {
			for(int i = 1; i <= 10; i++) {
				System.out.println(valor + " X " + i + " = " + valor * i);
			}
			
		}
		tcl.close();
		
	}
	
	
}
