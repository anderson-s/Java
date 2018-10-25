import java.util.Scanner;
public class atividade2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite as notas");
        double nota1 = tcl.nextDouble();
        double nota2 = tcl.nextDouble();
        double nota3 = tcl.nextDouble();
        
        if((nota1 + nota2 + nota3)/3 >= 7){
            System.out.println("Esta aprovado");
        }
        if((nota1 + nota2 + nota3)/3 >= 5 && (nota1 + nota2 + nota3)/3 < 7){
            System.out.println("O aluno esta na recuperacao");
        }
        if ((nota1 + nota2 + nota3)/3 < 5) {
            System.out.println("O aluno esta reprovado");
        }
    }
    
}
