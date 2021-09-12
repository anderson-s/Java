package Secao7_Estruturas_de_Decisao;

import java.util.Scanner;

public class atividade9 {
	public static void main(String [] args) {
		//Variaveis
		float poluicao;
		Scanner silva = new Scanner(System.in);
		//Entradas
	    System.out.print("Digite o valor: ");
	    poluicao = silva.nextFloat();
	    
	    
	    if(poluicao < 0.3){
	        System.out.printf("Níveis aceitáveis");
	        
	    }
	    if(poluicao >= 0.3 && poluicao < 0.4){
	    	System.out.printf("Grupo 1 - Suspender atividades");
	    }
	    
	    if(poluicao >= 0.4 && poluicao < 0.5){
	    	System.out.printf("Grupo 1 e Grupo - Suspender atividades");
	    }
	    if(poluicao >= 0.5){
	    	System.out.printf("Grupo 1,2 e 3 - Paralisar atividades");
	    }
		silva.close();
		
}
}
