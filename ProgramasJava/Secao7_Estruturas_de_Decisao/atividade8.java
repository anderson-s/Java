package Secao7_Estruturas_de_Decisao;

import java.util.Scanner;

public class atividade8 {
	public static void main(String [] args) {
		//Variaveis
		int a;
		Scanner silva = new Scanner(System.in);
		//Entradas
	    System.out.println("Digite o valor!");
	    a = silva.nextInt();
	    
	    
	    if(a % 2 == 0){
	        System.out.printf("O valor %d é par\n", a);
	    }
	    else{
	    	System.out.printf("O valor %d é impar\n", a);
	    }
	    if(a > 0){
	    	System.out.printf("O valor %d é positivo\n", a);
	    }
	    
	    else{
	    	System.out.printf("O valor %d é negativo\n", a);
	    }
		silva.close();
		
}
}