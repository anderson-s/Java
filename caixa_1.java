
import java.util.Scanner;
public class caixa_1 {
      public static void main (String[] args){
        Scanner  tcl = new Scanner(System.in);
        int opcao;
        double saldo = 100, saque, deposito;
        boolean sair = false;
        
        while (sair == false){
            System.out.println("caixa etletrônico");
            System.out.println("1 - sacar");
            System.out.println("2 - depositar");
            System.out.println("3 - saldo");
            System.out.println("4 - Sair");
            opcao = tcl.nextInt();
            if (opcao == 1){
                System.out.println("digite o valor que deseja sacar");
                saque = tcl.nextDouble();
                saldo = saldo - saque;
                
            }
            if (opcao == 2) {
             System.out.println("Digite o valor que desejar depositar");
            deposito = tcl.nextDouble();
            saldo = saldo + deposito;
                     
            }
            if (opcao == 3){
             System.out.println("Seu saldo é" + saldo);
                
            }
            if (opcao == 4){
                System.out.println("deseja realmente sair[s/n]");
                String ConfirmaSair = tcl.next();
                if(("s").equals("Confirma sair")){
                    sair = true;
                }
             
            }
        }
      }
}

    

