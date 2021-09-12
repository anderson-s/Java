package Secao_8_Estruturas_de_repeticao;
import java.util.Scanner;

public class atividade5 {
	public static void main(String[] args) {
		String nome, senha;
		Scanner tcl = new Scanner(System.in);
		System.out.println("Digite seu nome");
		nome = tcl.nextLine();
		System.out.println("Digite sua senha");
		senha = tcl.nextLine();
		
		tcl.close();
		
		if(nome.equals(senha)) {
			System.out.println("Nome e senha não ser iguais");
		}
		else {
			System.out.println("Usuário cadastrado com sucesso");
		}
	}
	 
}
