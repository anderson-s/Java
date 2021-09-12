package Secao_8_Estruturas_de_repeticao;

public class atividade2 {
	public static void main(String[] args) {
		String valor;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 10 == 0) {
			   valor = "é múltiplo de 10";
			} else {
				valor = "";
			}
			System.out.println(i + " " + valor);
		}
	}
}
