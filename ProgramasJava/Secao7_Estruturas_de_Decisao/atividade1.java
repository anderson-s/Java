package Secao7_Estruturas_de_Decisao;//Pasta onde o arquivo esta localizado

import java.util.Scanner; //Importando biblioteca para o usu�rio poder inseir valores
public class atividade1 {

	public static void main(String [] args) {
		Scanner silva = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		int n = silva.nextInt();
		
		if(n > 100) {
			System.out.println("Voc� digitou:" + n);
		}
		else if(n == 0){
			  System.out.println("O n�mero digitado � nulo" + n);
			}
		else {
			n = 0;
			System.out.println("O valor de n �: " + n);
		}
		silva.close();
	}

}
