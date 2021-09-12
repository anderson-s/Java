package Secao_4_Desvendando_Algoritmos;
import java.util.Scanner;
public class atividade5 {
	public static void main(String [] args) {
		Scanner tcl = new Scanner(System.in);
		float metro;
		System.out.println("Digite a quantidade minima");
		metro = tcl.nextFloat();
		tcl.close();
		System.out.println("O valor corresponde a: " + (metro * 100) + "cm");
		
	}
}
