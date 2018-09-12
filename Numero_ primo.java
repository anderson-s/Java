import java.util.Scanner;
public class Primos {

    public static void main(String[] args) {
      Scanner tcl = new Scanner(System.in);
      System.out.println("Digite um valor");
      int num1;
      int num2 = 0;
        System.out.println("Digite um numero");
        num1 = tcl.nextInt();
        for (int i = 1; i <= num1; i++) {
            if(num1 % i == 0){
                num2++;
        }
      }
       }if(num2 == 2){
            System.out.println("O numero digitado e primo.");
        }else{
            System.out.println("O numero digitado nao e primo.");
}
}
