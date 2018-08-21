import java.util.Random;

public class bublesort {
    public static void main(String[] args) {
        int vetor[] = new int[2];
        Random numerosaleatorios = new Random();
        
        for(int i = 0; i < vetor.length;i++){
            vetor[i] = numerosaleatorios.nextInt(10);           
        }
        int aux = 0;
        System.out.println("vetor nao ordenado");
        for(int i = 0; i < vetor.length;i++){
         System.out.print(vetor[i]+"");   
        }
        for(int i = 0; i < vetor.length;i++){
            for(int j = 0; j < vetor.length;j++)
                if(vetor[i] < vetor[j]){
                    aux = vetor[i];
                    vetor [i] = vetor [j];
                    vetor [j] = aux;
                }
        }        
        for( int i =  0 ; i < vetor.length; i ++ ) {
           System.out.println (vetor [i]);
    }
}
}
    

