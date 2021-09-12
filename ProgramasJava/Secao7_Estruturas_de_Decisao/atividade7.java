package Secao7_Estruturas_de_Decisao;

import java.util.Scanner;

public class atividade7 {
	public static void main(String [] args) {
		//Variaveis
		Scanner silva = new Scanner(System.in);
		int a, b, c, d, p1, p2, p3, p4;
		
		//Entradas
		System.out.println("Digite o valor1");
		a = silva.nextInt();
		
		System.out.println("Digite o valor2");
		b = silva.nextInt();
		
		System.out.println("Digite o valor3");
		c = silva.nextInt();
		
		System.out.println("Digite o valor4");
		d = silva.nextInt();
		
//		Processamento
		
		p1 = a * a;
		p2 = b * b;
		p3 = c * c;
		p4 = d * d;
		
		if(p3 >= 1000){
			System.out.printf("%d", p3);
	    }
		
		else{
	        System.out.printf("O quadrado de %d é %d\n", a, p1);
	        System.out.printf("O quadrado de %d é %d\n", b, p2);
	        System.out.printf("O quadrado de %d é %d\n", c, p3);
	        System.out.printf("O quadrado de %d é %d\n", d, p4);
	    }
		//Saídsa
		silva.close();
		
}
}