package Secao_8_Estruturas_de_repeticao;

import java.util.Scanner;

public class atividade4 {
	public static void main(String[] args) {
		int valor, maior = -999, menor = 999, soma = 0;
	    float media;
	    Scanner silva = new Scanner(System.in);
	    for(int i = 0; i < 10; i++){
	        System.out.printf("Digite um valor: ");
	        valor = silva.nextInt();
	        if(valor > 0){
	            if(valor > maior){
	                maior = valor;
	            }
	            if(valor < menor){
	                menor = valor;
	            }
	            soma = valor + soma;
	        }
	        else{
	            i--;
	        }
	    }
	    media = soma/10;
	    System.out.printf("O valor da soma é %d\n", soma);
	    System.out.printf("O maior valor é %d\n", maior);
	    System.out.printf("O menor valor é %d\n", menor);
	    System.out.printf("O valor da média é %.2f\n", media);
	    silva.close();
	}
}