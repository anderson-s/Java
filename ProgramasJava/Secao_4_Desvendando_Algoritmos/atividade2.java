package Secao_4_Desvendando_Algoritmos;
import java.util.Scanner;
public class atividade2 {
	public static void main(String [] args) {
		Scanner tcl = new Scanner(System.in);
		int minima, maxima;
		System.out.println("Digite a quantidade minima");
		minima = tcl.nextInt();
		System.out.println("Digite a quantidade máxima");
		maxima = tcl.nextInt();
		
		System.out.println("O estoque médio é: " + ((minima + maxima)/2));
		tcl.close();
	}
}
