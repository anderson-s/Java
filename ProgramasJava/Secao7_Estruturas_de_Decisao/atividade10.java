package Secao7_Estruturas_de_Decisao;

import java.util.Scanner;

public class atividade10 {
	public static void main(String [] args) {
		//Variaveis
		int idade;
		Scanner silva = new Scanner(System.in);
		//Entradas
	    System.out.print("Digite a idade: ");
	    idade = silva.nextInt();
	    
	    if(idade  < 7){
	        System.out.printf("Não pertence a nenhum grupo");
	        
	    }
	    if(idade  >= 5 && idade  <= 7){
	        System.out.printf("Infantil A");
	        
	    }
	    if(idade  > 7 && idade  <= 11){
	        System.out.printf("Infantil B");
	        
	    }
	    if(idade  > 11 && idade  <= 13){
	        System.out.printf("Juvenil A");
	        
	    }
	    if(idade  > 13 && idade  < 18){
	        System.out.printf("Juvenil B");
	        
	    }
	    if(idade >= 18){
	    	System.out.printf("Grupo Adulto");
	    }
		silva.close();
		
}
}